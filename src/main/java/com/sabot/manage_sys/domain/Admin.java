package com.sabot.manage_sys.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    @JsonIgnore
    private Integer userId;

    private String userName;

    private String psd;

}
