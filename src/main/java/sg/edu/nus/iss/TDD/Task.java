package sg.edu.nus.iss.TDD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private String description;
    private boolean isComplete;

    public Task(String description) {
        this(description, false);
    }
}
