//package com.exam.service;
//
//import io.ipfs.api.IPFS;
//import io.ipfs.api.MultiHash;
//import io.ipfs.api.NamedStreamable;
//
//import java.io.File;
//import java.io.IOException;
//
//public class IPFSService {
//
//    private IPFS ipfs;
//
//    public IPFSService() {
//        // Connect to your IPFS node (local or public)
//        ipfs = new IPFS("/ip4/127.0.0.1/tcp/5001");
//    }
//
//    public String uploadFile(File file) throws IOException {
//        // Create a file object for uploading
//        NamedStreamable.FileWrapper fileWrapper = new NamedStreamable.FileWrapper(file);
//
//        // Add file to IPFS and get the file hash (CID)
//        MultiHash fileHash = ipfs.add(fileWrapper).get(0).hash;
//        return fileHash.toString();  // Return the CID (hash) of the file
//    }
//
//    public byte[] downloadFile(String cid) throws IOException {
//        // Fetch the file from IPFS using the CID
//        return ipfs.cat(MultiHash.fromBase58(cid));
//    }
//}
