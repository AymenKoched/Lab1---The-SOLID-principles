package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encode = new EncodingModule();
        encode.encodeWithFiles();
        encode.encodeBasedOnNetworkAndDatabase();
    }
}
