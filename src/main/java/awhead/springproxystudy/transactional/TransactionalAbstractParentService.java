package awhead.springproxystudy.transactional;


import awhead.springproxystudy.TestJpaEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.aop.support.AopUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Transactional
@RequiredArgsConstructor
abstract public class TransactionalAbstractParentService {

    private final InjectionTarget injectionTarget;
    private final TestJpaEntityRepo testJpaEntityRepo;

    public void abstractParent() {
        System.out.println("Is transaction active: " + TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("this isAopProxy: " + AopUtils.isAopProxy(this));
        System.out.println("this isCglibProxy: " + AopUtils.isCglibProxy(this));
        System.out.println("this isJdkDynamicProxy: " + AopUtils.isJdkDynamicProxy(this));
    }
}