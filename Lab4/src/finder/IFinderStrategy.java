// LAB5, 자바 프로그래밍, 2분반, 25.06.04, 32203919 장천명
package finder;
 
public interface IFinderStrategy<T> {
    boolean match(T item);
} 