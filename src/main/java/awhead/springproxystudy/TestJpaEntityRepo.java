package awhead.springproxystudy;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestJpaEntityRepo extends JpaRepository<TestJpaEntity, Long> {
}
