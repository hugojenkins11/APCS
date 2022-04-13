// Blonde Himbos: Hugo Jenkins + Boary, Micheal Kamela, Jun Hong Wang
// APCS pd6
// HW90 - Deque
// 2022-04-11m
// time spent:  hr

import java.util.Iterator;
public class BattleBusDriver {
  public static void main(String[] args) {
    BattlePass<String> nite = new BattlePass();

    nite.addFirst("a");
    System.out.println(nite.peekFirst());
    nite.addLast("b");
    System.out.println(nite.peekLast());
    nite.addFirst("c");
    System.out.println(nite.peekFirst());
    nite.addLast("d");
    System.out.println(nite.peekLast() + "\n");

    System.out.println(nite.removeFirst());
    System.out.println(nite.removeFirst());
    System.out.println(nite.removeFirst());
    System.out.println(nite.removeFirst() + "\n");

    nite.addFirst("a");
    nite.addLast("b");
    nite.addFirst("c");
    nite.addLast("d");

    System.out.println("\n" + nite.removeLast());
    System.out.println(nite.removeLast());
    System.out.println(nite.removeLast());
    System.out.println(nite.removeLast() + "\n");

    System.out.println(nite.pollFirst());
    System.out.println(nite.pollLast());

    nite.addFirst("a");
    nite.addLast("b");
    nite.addFirst("c");
    nite.addLast("d");

    System.out.println(nite.pollFirst());
    System.out.println(nite.pollLast());
    System.out.println("");

    Iterator<String> iter = nite.iterator();
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }

    Iterator<String> desIter = nite.descendingIterator();
    while (iter.hasNext()) {
      System.out.println(desIter.next());
    }
  }
}
