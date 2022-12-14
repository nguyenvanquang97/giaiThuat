package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    private int id;
    private String userName;
    private String email;
    private String passWord;

    @Override
    public String toString() {
        return id+" - " +userName+" - "+email+" - "+passWord;
    }
}
