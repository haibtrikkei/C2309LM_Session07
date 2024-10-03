package demo_validate.validate_form.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    @NotBlank(message = "Roll number is empty!")
    private String rollNumber;
    @NotBlank(message = "Full name is empty!")
    private String fullName;
    @NotNull(message = "Gender is empty")
    private Boolean gender;
    @NotNull(message = "Birthday is empty")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "Birthday is not valid")
    private Date birthday;
    @NotBlank(message = "Address is empty!")
    private String address;
    @NotBlank(message = "Class name is empty!")
    private String className;
    private String imgUrl;
}
