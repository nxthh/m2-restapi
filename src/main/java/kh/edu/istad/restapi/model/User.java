package kh.edu.istad.restapi.model;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class User {
    private UUID id;

    private String name;

    private String username;

    private String password;

    private Boolean isActive;

}
