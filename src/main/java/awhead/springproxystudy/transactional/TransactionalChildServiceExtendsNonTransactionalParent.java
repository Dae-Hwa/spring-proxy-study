package awhead.springproxystudy.transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransactionalChildServiceExtendsNonTransactionalParent extends NonTransactionalAbstractParentService {

    public TransactionalChildServiceExtendsNonTransactionalParent(InjectionTarget injectionTarget) {
        super(injectionTarget);
    }
}
