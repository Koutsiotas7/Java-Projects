package bankSystem.service;

import bankSystem.model.Account;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class StorageService
{
    private static final String FILE_NAME = "accounts.json";

    private final ObjectMapper mapper;

    public StorageService() 
    {
        this.mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public void save(Map<String, Account> accounts) 
    {
        try 
        {
            mapper.writerWithDefaultPrettyPrinter()
                  .writeValue(new File(FILE_NAME), accounts);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            throw new RuntimeException("Failed to save data", e);
        }
    }

    public Map<String, Account> load() 
    {
        File file = new File(FILE_NAME);

        if (!file.exists()) 
        {
            return new HashMap<>();
        }

        try 
        {
            return mapper.readValue(file, new TypeReference<Map<String, Account>>() {});
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            throw new RuntimeException("Failed to load data", e);
        }
    }
}