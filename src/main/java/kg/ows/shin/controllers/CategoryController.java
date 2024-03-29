package kg.ows.shin.controllers;

import kg.ows.shin.dto.CategoryDTO;
import kg.ows.shin.repositories.CategoryRepository;
import kg.ows.shin.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/category")
public class CategoryController {
    public final CategoryService categoryService;
    @GetMapping
    public Set<CategoryDTO> list() {
        return categoryService.getList();
    }
}
