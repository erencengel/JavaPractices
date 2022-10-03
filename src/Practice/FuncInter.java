package Practice;

@FunctionalInterface
public interface FuncInter<T,R,K> {
    T take(R r,K k);
}
