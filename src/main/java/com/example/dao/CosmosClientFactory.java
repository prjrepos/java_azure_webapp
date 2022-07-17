package com.example.dao;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

public class CosmosClientFactory {
    private static final String HOST = "https://azuretrainingdb.documents.azure.com:443/";
    private static final String MASTER_KEY = "MAiM7lBnuaVmNc36jrCqrVw6H9szQz4VGO7fb6XSx68atxrR9iWd605uSWTDIomfFOx1VScf7AHJSrBJXsTG6Q==";

    private static CosmosClient cosmosClient = new CosmosClientBuilder()
            .endpoint(HOST)
            .key(MASTER_KEY)
            .consistencyLevel(ConsistencyLevel.EVENTUAL)
            .buildClient();

    public static CosmosClient getCosmosClient() {
        return cosmosClient;
    }

}