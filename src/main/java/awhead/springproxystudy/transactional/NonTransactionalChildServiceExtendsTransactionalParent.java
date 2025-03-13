package awhead.springproxystudy.transactional;

import awhead.springproxystudy.TestJpaEntityRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NonTransactionalChildServiceExtendsTransactionalParent extends TransactionalAbstractParentService {


    private final TestJpaEntityRepo testJpaEntityRepo;

    public NonTransactionalChildServiceExtendsTransactionalParent(
            InjectionTarget injectionTarget,
            TestJpaEntityRepo testJpaEntityRepo
    ) {
        super(injectionTarget, testJpaEntityRepo);
        this.testJpaEntityRepo = testJpaEntityRepo;
    }

    @Transactional
    void testSearch() {
        testJpaEntityRepo.findAll();
    }
}
