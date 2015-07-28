/*     / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.collection.euler;

import javaslang.Tuple;
import javaslang.Tuple2;
import javaslang.collection.List;
import javaslang.collection.Stream;

import java.util.function.Predicate;

public class Utils {

    public static Stream<Integer> fibonacci() {
        return Stream.of(1, 1).appendSelf(self -> self.zip(self.tail()).map(t -> t._1 + t._2));
    }

    public static <T1, T2> List<Tuple2<T1, T2>> cross(List<T1> v1, List<T2> v2) {
        return v1.flatMap(a -> v2.map(b -> Tuple.of(a, b)));
    }

}
