package main;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String name;
    private String gender;
    private Integer numberOfGames;

    public String getCount() {
        return numberOfGames.toString();
    }
}
