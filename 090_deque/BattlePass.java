// Blonde Himbos: Hugo Jenkins + Boary, Micheal Kamela, Jun Hong Wang
// APCS pd6
// HW90 - Deque
// 2022-04-11m
// time spent:  hr

import java.util.LinkedList;
import java.util.Iterator;


public class BattlePass<FORTNITE> implements Deque<FORTNITE> {
  private LinkedList<FORTNITE> _fort;

  public BattlePass() {
    _fort = new LinkedList();
  }

  public FORTNITE peekFirst() {
    return _fort.peekFirst();
  }

  public FORTNITE peekLast() {
    return _fort.peekLast();
  }

  public void addFirst(FORTNITE x) {
    _fort.addFirst(x);
  }

  public void addLast(FORTNITE x) {
    _fort.addLast(x);
  }

  public FORTNITE removeFirst() {
    FORTNITE retVal = _fort.removeFirst();
    return retVal;
  }

  public FORTNITE removeLast() {
    FORTNITE retVal = _fort.removeLast();
    return retVal;
  }

  public FORTNITE pollFirst() {
    if (_fort.peekFirst() == null) {
      return null;
    } else {
      return _fort.removeFirst();
    }
  }

  public FORTNITE pollLast() {
    if (_fort.peekLast() == null) {
      return null;
    } else {
      return _fort.removeLast();
    }
  }

  public FORTNITE getFirst() {
    return _fort.getFirst();
  }

  public FORTNITE getLast() {
    return _fort.getLast();
  }
/*
  public Iterator<FORTNITE> iterator() {
    return _fort.iterator();
  }

  public Iterator<FORTNITE> descendingIterator() {
    return _fort.descendingIterator();
  }
  */

}
