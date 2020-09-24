package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trainee {
    @NotNull(message = "姓名不能为空")
    private String name;

    @NotNull(message = "办公室不能为空")
    private String office;

    @NotNull(message = "邮箱不能为空")
    @Email(message = "邮箱不合法")
    private String email;

    @NotNull(message = "zoomId不能为空")
    private String zoomId;

    @NotNull(message = "Github账户不能为空")
    private String github;
}
