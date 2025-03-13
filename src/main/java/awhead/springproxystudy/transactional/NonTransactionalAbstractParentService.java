package awhead.springproxystudy.transactional;


import lombok.RequiredArgsConstructor;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@RequiredArgsConstructor
abstract public class NonTransactionalAbstractParentService {

    //    @Autowired
    private final InjectionTarget injectionTarget;

    public boolean isTransactionActive() {
        System.out.println("Is transaction active: " + TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("this isAopProxy: " + AopUtils.isAopProxy(this));
        System.out.println("this isCglibProxy: " + AopUtils.isCglibProxy(this));
        System.out.println("this isJdkDynamicProxy: " + AopUtils.isJdkDynamicProxy(this));

        return TransactionSynchronizationManager.isActualTransactionActive();
    }
}