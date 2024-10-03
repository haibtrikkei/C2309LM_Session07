package demo_validate.validate_form.controller;

import demo_validate.validate_form.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

@Controller
@RequestMapping(value = {"/","/students"})
public class StudentController {
    @Autowired
    private ServletContext servletContext;

    @RequestMapping
    public String initInsertStudent(Model model){
        Student s = new Student();
        model.addAttribute("s",s);
        return "insertStudent";
    }

    @RequestMapping("/insertStudent")
    public String insertStudent(@Valid @ModelAttribute("s")Student s, BindingResult result, @RequestParam("avatarFile") MultipartFile file, Model model){
        if(result.hasErrors()){
            model.addAttribute("s",s);
            return "insertStudent";
        }else{
            //xử lý upload ảnh
            //Lấy đường dẫn tương đối đến thư mục images trong thư mục resources:
            String path = servletContext.getRealPath("/resources/images");
            File f0  = new File(path);
            if(!f0.exists()){
                f0.mkdir(); //Nếu thư mục chưa có thì tạo mới thư mục
            }

            //Tạo đường dẫn tuyệt đối tới ảnh sẽ được upload lên
            File dest = new File(f0.getAbsolutePath()+File.separator+file.getOriginalFilename());

            if(!dest.exists()){
                try {
                    Files.write(dest.toPath(),file.getBytes(), StandardOpenOption.CREATE_NEW);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            s.setImgUrl(file.getOriginalFilename());  //Lưu vào database chỉ lưu tên ảnh
            model.addAttribute("s",s);
            return "viewStudent";
        }
    }
}
