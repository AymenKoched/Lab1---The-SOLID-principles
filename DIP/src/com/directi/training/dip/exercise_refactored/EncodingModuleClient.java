package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        Database database = new MyDatabase();
        Encoding encodingModule = new EncodingModule(database);

        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
