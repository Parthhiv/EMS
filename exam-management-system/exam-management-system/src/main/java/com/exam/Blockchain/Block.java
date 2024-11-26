package com.exam.Blockchain;

import java.util.Date;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Block {
    private String previousHash;
    private String currentHash;
    private String data;
    private long timeStamp;
    private int blockID;
    private int nonce; // Used for proof-of-work

    // Constructor
    public Block(int blockID, String data, String previousHash) {
        this.blockID = blockID;
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.currentHash = calculateHash();
    }

    // Method to calculate the hash of the block
    public String calculateHash() {
        String input = previousHash + Long.toString(timeStamp) + data + Integer.toString(nonce);
        return applySha256(input);
    }

    // SHA-256 hashing function
    public static String applySha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String getCurrentHash() {
        return currentHash;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public int getBlockID() {
        return blockID;
    }

    public String getData() {
        return data;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }
}
