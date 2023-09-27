package mate.project.onlinebookshop.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class BookDto {
    private String title;
    private String author;
    private String asbn;
    private BigDecimal price;
    private String description;
    private String coverImage;
}
