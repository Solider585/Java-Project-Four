package functors;

interface Functor<R,T> { 
    // apply(p) runs some computation on param of type T and returns a value of type R
    R apply(T param);
 }

