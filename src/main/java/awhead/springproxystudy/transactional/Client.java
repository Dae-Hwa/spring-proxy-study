package awhead.springproxystudy.transactional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Client {

    private final NonTransactionalChildServiceExtendsTransactionalParent childService;

    private final TransactionalChildServiceExtendsNonTransactionalParent transactionalChildServiceExtendsNonTransactionalParent;

    public void run() {
        childService.abstractParent();

        transactionalChildServiceExtendsNonTransactionalParent.isTransactionActive();
    }
}
