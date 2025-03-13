package awhead.springproxystudy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class TestJpaEntity {
    @Id
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;
}
