package core.cached;

import java.io.IOException;
import java.io.StringReader;

import org.eclipse.imp.pdb.facts.type.TypeFactory;
import org.eclipse.imp.pdb.facts.IConstructor;
import org.eclipse.imp.pdb.facts.ISourceLocation;
import org.eclipse.imp.pdb.facts.IValue;
import org.eclipse.imp.pdb.facts.IValueFactory;
import org.eclipse.imp.pdb.facts.exceptions.FactTypeUseException;
import org.eclipse.imp.pdb.facts.io.StandardTextReader;
import org.rascalmpl.parser.gtd.stack.*;
import org.rascalmpl.parser.gtd.stack.filter.*;
import org.rascalmpl.parser.gtd.stack.filter.follow.*;
import org.rascalmpl.parser.gtd.stack.filter.match.*;
import org.rascalmpl.parser.gtd.stack.filter.precede.*;
import org.rascalmpl.parser.gtd.preprocessing.ExpectBuilder;
import org.rascalmpl.parser.gtd.util.IntegerKeyedHashMap;
import org.rascalmpl.parser.gtd.util.IntegerList;
import org.rascalmpl.parser.gtd.util.IntegerMap;
import org.rascalmpl.values.ValueFactoryFactory;
import org.rascalmpl.values.uptr.RascalValueFactory;
import org.rascalmpl.values.uptr.ITree;

@SuppressWarnings("all")
public class Parser extends org.rascalmpl.parser.gtd.SGTDBF<IConstructor, ITree, ISourceLocation> {
  protected final static IValueFactory VF = ValueFactoryFactory.getValueFactory();

  protected static IValue _read(java.lang.String s, org.eclipse.imp.pdb.facts.type.Type type) {
    try {
      return new StandardTextReader().read(VF, org.rascalmpl.values.uptr.RascalValueFactory.uptr, type, new StringReader(s));
    }
    catch (FactTypeUseException e) {
      throw new RuntimeException("unexpected exception in generated parser", e);  
    } catch (IOException e) {
      throw new RuntimeException("unexpected exception in generated parser", e);  
    }
  }
	
  protected static java.lang.String _concat(java.lang.String ...args) {
    int length = 0;
    for (java.lang.String s :args) {
      length += s.length();
    }
    java.lang.StringBuilder b = new java.lang.StringBuilder(length);
    for (java.lang.String s : args) {
      b.append(s);
    }
    return b.toString();
  }
  protected static final TypeFactory _tf = TypeFactory.getInstance();
 
  private static final IntegerMap _resultStoreIdMappings;
  private static final IntegerKeyedHashMap<IntegerList> _dontNest;
	
  protected static void _putDontNest(IntegerKeyedHashMap<IntegerList> result, int parentId, int childId) {
    IntegerList donts = result.get(childId);
    if (donts == null) {
      donts = new IntegerList();
      result.put(childId, donts);
    }
    donts.add(parentId);
  }
    
  protected int getResultStoreId(int parentId) {
    return _resultStoreIdMappings.get(parentId);
  }
    
  protected static IntegerKeyedHashMap<IntegerList> _initDontNest() {
    IntegerKeyedHashMap<IntegerList> result = new IntegerKeyedHashMap<IntegerList>(); 
    
    
    
    
    _putDontNest(result, 452, 514);
    
    _putDontNest(result, 625, 687);
    
    _putDontNest(result, 452, 638);
    
    _putDontNest(result, 498, 543);
    
    _putDontNest(result, 581, 750);
    
    _putDontNest(result, 408, 743);
    
    _putDontNest(result, 528, 694);
    
    _putDontNest(result, 704, 687);
    
    _putDontNest(result, 600, 673);
    
    _putDontNest(result, 631, 680);
    
    _putDontNest(result, 597, 673);
    
    _putDontNest(result, 476, 504);
    
    _putDontNest(result, 445, 694);
    
    _putDontNest(result, 567, 604);
    
    _putDontNest(result, 536, 536);
    
    _putDontNest(result, 649, 666);
    
    _putDontNest(result, 571, 673);
    
    _putDontNest(result, 445, 564);
    
    _putDontNest(result, 470, 613);
    
    _putDontNest(result, 376, 536);
    
    _putDontNest(result, 504, 722);
    
    _putDontNest(result, 367, 750);
    
    _putDontNest(result, 514, 687);
    
    _putDontNest(result, 489, 536);
    
    _putDontNest(result, 440, 543);
    
    _putDontNest(result, 539, 622);
    
    _putDontNest(result, 536, 729);
    
    _putDontNest(result, 440, 581);
    
    _putDontNest(result, 498, 581);
    
    _putDontNest(result, 376, 729);
    
    _putDontNest(result, 616, 715);
    
    _putDontNest(result, 489, 729);
    
    _putDontNest(result, 733, 673);
    
    _putDontNest(result, 521, 631);
    
    _putDontNest(result, 718, 680);
    
    _putDontNest(result, 514, 673);
    
    _putDontNest(result, 560, 750);
    
    _putDontNest(result, 543, 543);
    
    _putDontNest(result, 567, 550);
    
    _putDontNest(result, 557, 638);
    
    _putDontNest(result, 543, 581);
    
    _putDontNest(result, 428, 750);
    
    _putDontNest(result, 625, 673);
    
    _putDontNest(result, 571, 687);
    
    _putDontNest(result, 524, 680);
    
    _putDontNest(result, 476, 495);
    
    _putDontNest(result, 539, 597);
    
    _putDontNest(result, 461, 666);
    
    _putDontNest(result, 553, 694);
    
    _putDontNest(result, 532, 631);
    
    _putDontNest(result, 403, 729);
    
    _putDontNest(result, 597, 687);
    
    _putDontNest(result, 600, 687);
    
    _putDontNest(result, 416, 701);
    
    _putDontNest(result, 638, 701);
    
    _putDontNest(result, 607, 638);
    
    _putDontNest(result, 704, 673);
    
    _putDontNest(result, 553, 564);
    
    _putDontNest(result, 539, 571);
    
    _putDontNest(result, 733, 687);
    
    _putDontNest(result, 457, 564);
    
    _putDontNest(result, 550, 722);
    
    _putDontNest(result, 457, 694);
    
    _putDontNest(result, 658, 743);
    
    _putDontNest(result, 360, 631);
    
    _putDontNest(result, 539, 645);
    
    _putDontNest(result, 452, 521);
    
    _putDontNest(result, 479, 613);
    
    _putDontNest(result, 476, 658);
    
    _putDontNest(result, 528, 564);
    
    _putDontNest(result, 403, 536);
    
    _putDontNest(result, 421, 658);
    
    _putDontNest(result, 697, 715);
    
    _putDontNest(result, 445, 476);
    
    _putDontNest(result, 584, 658);
    
    _putDontNest(result, 524, 571);
    
    _putDontNest(result, 557, 715);
    
    _putDontNest(result, 504, 694);
    
    _putDontNest(result, 4530, 743);
    
    _putDontNest(result, 690, 680);
    
    _putDontNest(result, 711, 715);
    
    _putDontNest(result, 536, 750);
    
    _putDontNest(result, 392, 708);
    
    _putDontNest(result, 593, 631);
    
    _putDontNest(result, 452, 715);
    
    _putDontNest(result, 567, 666);
    
    _putDontNest(result, 524, 645);
    
    _putDontNest(result, 528, 722);
    
    _putDontNest(result, 367, 729);
    
    _putDontNest(result, 725, 701);
    
    _putDontNest(result, 461, 550);
    
    _putDontNest(result, 616, 638);
    
    _putDontNest(result, 457, 722);
    
    _putDontNest(result, 550, 694);
    
    _putDontNest(result, 421, 495);
    
    _putDontNest(result, 550, 564);
    
    _putDontNest(result, 622, 631);
    
    _putDontNest(result, 360, 435);
    
    _putDontNest(result, 504, 564);
    
    _putDontNest(result, 607, 715);
    
    _putDontNest(result, 428, 536);
    
    _putDontNest(result, 445, 722);
    
    _putDontNest(result, 560, 536);
    
    _putDontNest(result, 564, 687);
    
    _putDontNest(result, 575, 613);
    
    _putDontNest(result, 495, 631);
    
    _putDontNest(result, 403, 750);
    
    _putDontNest(result, 613, 666);
    
    _putDontNest(result, 421, 504);
    
    _putDontNest(result, 546, 708);
    
    _putDontNest(result, 581, 729);
    
    _putDontNest(result, 485, 581);
    
    _putDontNest(result, 457, 476);
    
    _putDontNest(result, 524, 622);
    
    _putDontNest(result, 485, 543);
    
    _putDontNest(result, 452, 528);
    
    _putDontNest(result, 631, 645);
    
    _putDontNest(result, 461, 604);
    
    _putDontNest(result, 560, 729);
    
    _putDontNest(result, 428, 729);
    
    _putDontNest(result, 508, 613);
    
    _putDontNest(result, 435, 701);
    
    _putDontNest(result, 489, 750);
    
    _putDontNest(result, 564, 673);
    
    _putDontNest(result, 367, 536);
    
    _putDontNest(result, 524, 597);
    
    _putDontNest(result, 376, 750);
    
    _putDontNest(result, 539, 680);
    
    _putDontNest(result, 553, 722);
    
    _putDontNest(result, 504, 521);
    
    _putDontNest(result, 445, 715);
    
    _putDontNest(result, 528, 715);
    
    _putDontNest(result, 457, 715);
    
    _putDontNest(result, 645, 673);
    
    _putDontNest(result, 408, 557);
    
    _putDontNest(result, 733, 323);
    
    _putDontNest(result, 421, 729);
    
    _putDontNest(result, 697, 722);
    
    _putDontNest(result, 479, 645);
    
    _putDontNest(result, 539, 613);
    
    _putDontNest(result, 367, 504);
    
    _putDontNest(result, 557, 722);
    
    _putDontNest(result, 485, 687);
    
    _putDontNest(result, 428, 495);
    
    _putDontNest(result, 440, 485);
    
    _putDontNest(result, 607, 722);
    
    _putDontNest(result, 641, 680);
    
    _putDontNest(result, 479, 571);
    
    _putDontNest(result, 476, 750);
    
    _putDontNest(result, 470, 571);
    
    _putDontNest(result, 421, 536);
    
    _putDontNest(result, 452, 722);
    
    _putDontNest(result, 575, 680);
    
    _putDontNest(result, 504, 514);
    
    _putDontNest(result, 461, 590);
    
    _putDontNest(result, 508, 680);
    
    _putDontNest(result, 416, 708);
    
    _putDontNest(result, 638, 708);
    
    _putDontNest(result, 367, 658);
    
    _putDontNest(result, 517, 631);
    
    _putDontNest(result, 584, 729);
    
    _putDontNest(result, 470, 645);
    
    _putDontNest(result, 445, 528);
    
    _putDontNest(result, 553, 715);
    
    _putDontNest(result, 485, 673);
    
    _putDontNest(result, 479, 622);
    
    _putDontNest(result, 634, 645);
    
    _putDontNest(result, 711, 722);
    
    _putDontNest(result, 470, 597);
    
    _putDontNest(result, 428, 504);
    
    _putDontNest(result, 504, 638);
    
    _putDontNest(result, 367, 495);
    
    _putDontNest(result, 428, 658);
    
    _putDontNest(result, 645, 687);
    
    _putDontNest(result, 564, 581);
    
    _putDontNest(result, 550, 638);
    
    _putDontNest(result, 564, 543);
    
    _putDontNest(result, 470, 622);
    
    _putDontNest(result, 560, 658);
    
    _putDontNest(result, 616, 694);
    
    _putDontNest(result, 676, 743);
    
    _putDontNest(result, 452, 476);
    
    _putDontNest(result, 457, 528);
    
    _putDontNest(result, 479, 597);
    
    _putDontNest(result, 746, 729);
    
    _putDontNest(result, 581, 658);
    
    _putDontNest(result, 367, 428);
    
    _putDontNest(result, 528, 528);
    
    _putDontNest(result, 725, 708);
    
    _putDontNest(result, 376, 658);
    
    _putDontNest(result, 536, 658);
    
    _putDontNest(result, 403, 504);
    
    _putDontNest(result, 376, 495);
    
    _putDontNest(result, 575, 622);
    
    _putDontNest(result, 504, 715);
    
    _putDontNest(result, 575, 597);
    
    _putDontNest(result, 528, 521);
    
    _putDontNest(result, 504, 528);
    
    _putDontNest(result, 498, 673);
    
    _putDontNest(result, 376, 504);
    
    _putDontNest(result, 445, 638);
    
    _putDontNest(result, 746, 750);
    
    _putDontNest(result, 508, 571);
    
    _putDontNest(result, 575, 645);
    
    _putDontNest(result, 514, 581);
    
    _putDontNest(result, 662, 743);
    
    _putDontNest(result, 543, 673);
    
    _putDontNest(result, 489, 658);
    
    _putDontNest(result, 528, 638);
    
    _putDontNest(result, 514, 543);
    
    _putDontNest(result, 479, 680);
    
    _putDontNest(result, 421, 750);
    
    _putDontNest(result, 616, 722);
    
    _putDontNest(result, 590, 666);
    
    _putDontNest(result, 457, 638);
    
    _putDontNest(result, 553, 638);
    
    _putDontNest(result, 604, 743);
    
    _putDontNest(result, 403, 428);
    
    _putDontNest(result, 498, 687);
    
    _putDontNest(result, 445, 521);
    
    _putDontNest(result, 607, 694);
    
    _putDontNest(result, 584, 750);
    
    _putDontNest(result, 457, 514);
    
    _putDontNest(result, 485, 485);
    
    _putDontNest(result, 440, 687);
    
    _putDontNest(result, 528, 514);
    
    _putDontNest(result, 557, 694);
    
    _putDontNest(result, 508, 622);
    
    _putDontNest(result, 524, 613);
    
    _putDontNest(result, 557, 564);
    
    _putDontNest(result, 546, 701);
    
    _putDontNest(result, 600, 581);
    
    _putDontNest(result, 550, 715);
    
    _putDontNest(result, 634, 680);
    
    _putDontNest(result, 445, 514);
    
    _putDontNest(result, 457, 521);
    
    _putDontNest(result, 476, 729);
    
    _putDontNest(result, 508, 597);
    
    _putDontNest(result, 403, 495);
    
    _putDontNest(result, 571, 543);
    
    _putDontNest(result, 571, 581);
    
    _putDontNest(result, 435, 708);
    
    _putDontNest(result, 376, 428);
    
    _putDontNest(result, 467, 631);
    
    _putDontNest(result, 452, 694);
    
    _putDontNest(result, 392, 701);
    
    _putDontNest(result, 543, 687);
    
    _putDontNest(result, 452, 564);
    
    _putDontNest(result, 470, 680);
    
    _putDontNest(result, 567, 590);
    
    _putDontNest(result, 476, 536);
    
    _putDontNest(result, 711, 694);
    
    _putDontNest(result, 508, 645);
    
    _putDontNest(result, 403, 658);
    
    _putDontNest(result, 440, 673);
    
    _putDontNest(result, 697, 694);
    
    _putDontNest(result, 536, 701);
    
    _putDontNest(result, 360, 557);
    
    _putDontNest(result, 550, 550);
    
    _putDontNest(result, 725, 750);
    
    _putDontNest(result, 532, 557);
    
    _putDontNest(result, 445, 666);
    
    _putDontNest(result, 521, 557);
    
    _putDontNest(result, 416, 536);
    
    _putDontNest(result, 504, 550);
    
    _putDontNest(result, 392, 495);
    
    _putDontNest(result, 654, 658);
    
    _putDontNest(result, 634, 687);
    
    _putDontNest(result, 440, 680);
    
    _putDontNest(result, 376, 421);
    
    _putDontNest(result, 600, 613);
    
    _putDontNest(result, 645, 645);
    
    _putDontNest(result, 485, 597);
    
    _putDontNest(result, 597, 613);
    
    _putDontNest(result, 470, 673);
    
    _putDontNest(result, 571, 613);
    
    _putDontNest(result, 376, 701);
    
    _putDontNest(result, 461, 564);
    
    _putDontNest(result, 435, 750);
    
    _putDontNest(result, 489, 701);
    
    _putDontNest(result, 461, 694);
    
    _putDontNest(result, 553, 666);
    
    _putDontNest(result, 498, 680);
    
    _putDontNest(result, 546, 658);
    
    _putDontNest(result, 746, 708);
    
    _putDontNest(result, 479, 687);
    
    _putDontNest(result, 457, 666);
    
    _putDontNest(result, 590, 638);
    
    _putDontNest(result, 485, 645);
    
    _putDontNest(result, 634, 673);
    
    _putDontNest(result, 504, 604);
    
    _putDontNest(result, 517, 743);
    
    _putDontNest(result, 485, 571);
    
    _putDontNest(result, 567, 722);
    
    _putDontNest(result, 528, 666);
    
    _putDontNest(result, 392, 504);
    
    _putDontNest(result, 392, 658);
    
    _putDontNest(result, 514, 613);
    
    _putDontNest(result, 649, 694);
    
    _putDontNest(result, 421, 708);
    
    _putDontNest(result, 550, 604);
    
    _putDontNest(result, 470, 687);
    
    _putDontNest(result, 543, 680);
    
    _putDontNest(result, 403, 421);
    
    _putDontNest(result, 485, 467);
    
    _putDontNest(result, 479, 673);
    
    _putDontNest(result, 416, 729);
    
    _putDontNest(result, 524, 543);
    
    _putDontNest(result, 485, 622);
    
    _putDontNest(result, 638, 729);
    
    _putDontNest(result, 524, 581);
    
    _putDontNest(result, 613, 722);
    
    _putDontNest(result, 403, 701);
    
    _putDontNest(result, 584, 708);
    
    _putDontNest(result, 528, 604);
    
    _putDontNest(result, 725, 729);
    
    _putDontNest(result, 445, 550);
    
    _putDontNest(result, 476, 708);
    
    _putDontNest(result, 440, 467);
    
    _putDontNest(result, 575, 687);
    
    _putDontNest(result, 543, 622);
    
    _putDontNest(result, 581, 701);
    
    _putDontNest(result, 567, 564);
    
    _putDontNest(result, 645, 680);
    
    _putDontNest(result, 553, 550);
    
    _putDontNest(result, 504, 666);
    
    _putDontNest(result, 641, 673);
    
    _putDontNest(result, 604, 631);
    
    _putDontNest(result, 649, 722);
    
    _putDontNest(result, 543, 645);
    
    _putDontNest(result, 367, 421);
    
    _putDontNest(result, 539, 581);
    
    _putDontNest(result, 590, 715);
    
    _putDontNest(result, 508, 687);
    
    _putDontNest(result, 539, 543);
    
    _putDontNest(result, 440, 622);
    
    _putDontNest(result, 613, 694);
    
    _putDontNest(result, 435, 729);
    
    _putDontNest(result, 553, 604);
    
    _putDontNest(result, 543, 597);
    
    _putDontNest(result, 557, 590);
    
    _putDontNest(result, 498, 622);
    
    _putDontNest(result, 457, 550);
    
    _putDontNest(result, 416, 750);
    
    _putDontNest(result, 638, 750);
    
    _putDontNest(result, 461, 722);
    
    _putDontNest(result, 641, 687);
    
    _putDontNest(result, 498, 597);
    
    _putDontNest(result, 528, 550);
    
    _putDontNest(result, 428, 701);
    
    _putDontNest(result, 440, 597);
    
    _putDontNest(result, 452, 590);
    
    _putDontNest(result, 485, 680);
    
    _putDontNest(result, 560, 701);
    
    _putDontNest(result, 575, 673);
    
    _putDontNest(result, 445, 604);
    
    _putDontNest(result, 440, 571);
    
    _putDontNest(result, 498, 645);
    
    _putDontNest(result, 467, 743);
    
    _putDontNest(result, 567, 694);
    
    _putDontNest(result, 498, 571);
    
    _putDontNest(result, 440, 645);
    
    _putDontNest(result, 508, 673);
    
    _putDontNest(result, 550, 666);
    
    _putDontNest(result, 435, 536);
    
    _putDontNest(result, 564, 613);
    
    _putDontNest(result, 543, 571);
    
    _putDontNest(result, 457, 604);
    
    _putDontNest(result, 495, 557);
    
    _putDontNest(result, 367, 701);
    
    _putDontNest(result, 564, 680);
    
    _putDontNest(result, 514, 597);
    
    _putDontNest(result, 528, 590);
    
    _putDontNest(result, 521, 743);
    
    _putDontNest(result, 571, 645);
    
    _putDontNest(result, 600, 622);
    
    _putDontNest(result, 625, 645);
    
    _putDontNest(result, 539, 673);
    
    _putDontNest(result, 457, 590);
    
    _putDontNest(result, 532, 743);
    
    _putDontNest(result, 435, 504);
    
    _putDontNest(result, 461, 715);
    
    _putDontNest(result, 746, 701);
    
    _putDontNest(result, 517, 557);
    
    _putDontNest(result, 452, 550);
    
    _putDontNest(result, 690, 673);
    
    _putDontNest(result, 514, 622);
    
    _putDontNest(result, 571, 571);
    
    _putDontNest(result, 421, 701);
    
    _putDontNest(result, 445, 590);
    
    _putDontNest(result, 616, 666);
    
    _putDontNest(result, 590, 722);
    
    _putDontNest(result, 435, 658);
    
    _putDontNest(result, 600, 645);
    
    _putDontNest(result, 557, 550);
    
    _putDontNest(result, 597, 645);
    
    _putDontNest(result, 567, 638);
    
    _putDontNest(result, 546, 750);
    
    _putDontNest(result, 575, 581);
    
    _putDontNest(result, 649, 715);
    
    _putDontNest(result, 485, 613);
    
    _putDontNest(result, 403, 708);
    
    _putDontNest(result, 584, 701);
    
    _putDontNest(result, 452, 604);
    
    _putDontNest(result, 435, 495);
    
    _putDontNest(result, 600, 597);
    
    _putDontNest(result, 508, 543);
    
    _putDontNest(result, 461, 528);
    
    _putDontNest(result, 571, 597);
    
    _putDontNest(result, 508, 581);
    
    _putDontNest(result, 539, 687);
    
    _putDontNest(result, 514, 571);
    
    _putDontNest(result, 571, 622);
    
    _putDontNest(result, 392, 750);
    
    _putDontNest(result, 536, 708);
    
    _putDontNest(result, 360, 743);
    
    _putDontNest(result, 597, 622);
    
    _putDontNest(result, 408, 631);
    
    _putDontNest(result, 557, 604);
    
    _putDontNest(result, 489, 708);
    
    _putDontNest(result, 690, 687);
    
    _putDontNest(result, 613, 638);
    
    _putDontNest(result, 553, 590);
    
    _putDontNest(result, 376, 708);
    
    _putDontNest(result, 514, 645);
    
    _putDontNest(result, 622, 743);
    
    _putDontNest(result, 669, 743);
    
    _putDontNest(result, 718, 687);
    
    _putDontNest(result, 560, 708);
    
    _putDontNest(result, 428, 708);
    
    _putDontNest(result, 697, 666);
    
    _putDontNest(result, 514, 680);
    
    _putDontNest(result, 504, 590);
    
    _putDontNest(result, 470, 581);
    
    _putDontNest(result, 392, 536);
    
    _putDontNest(result, 607, 666);
    
    _putDontNest(result, 408, 435);
    
    _putDontNest(result, 498, 613);
    
    _putDontNest(result, 392, 729);
    
    _putDontNest(result, 557, 666);
    
    _putDontNest(result, 564, 571);
    
    _putDontNest(result, 543, 613);
    
    _putDontNest(result, 581, 708);
    
    _putDontNest(result, 546, 729);
    
    _putDontNest(result, 564, 645);
    
    _putDontNest(result, 567, 715);
    
    _putDontNest(result, 452, 666);
    
    _putDontNest(result, 711, 666);
    
    _putDontNest(result, 593, 743);
    
    _putDontNest(result, 625, 680);
    
    _putDontNest(result, 631, 687);
    
    _putDontNest(result, 704, 680);
    
    _putDontNest(result, 461, 521);
    
    _putDontNest(result, 564, 597);
    
    _putDontNest(result, 550, 590);
    
    _putDontNest(result, 467, 557);
    
    _putDontNest(result, 479, 581);
    
    _putDontNest(result, 416, 504);
    
    _putDontNest(result, 479, 543);
    
    _putDontNest(result, 546, 536);
    
    _putDontNest(result, 683, 743);
    
    _putDontNest(result, 524, 673);
    
    _putDontNest(result, 367, 708);
    
    _putDontNest(result, 638, 658);
    
    _putDontNest(result, 416, 658);
    
    _putDontNest(result, 564, 622);
    
    _putDontNest(result, 470, 543);
    
    _putDontNest(result, 718, 673);
    
    _putDontNest(result, 613, 715);
    
    _putDontNest(result, 733, 680);
    
    _putDontNest(result, 590, 694);
    
    _putDontNest(result, 461, 514);
    
    _putDontNest(result, 495, 743);
    
    _putDontNest(result, 524, 687);
    
    _putDontNest(result, 476, 701);
    
    _putDontNest(result, 571, 680);
    
    _putDontNest(result, 597, 680);
    
    _putDontNest(result, 416, 495);
    
    _putDontNest(result, 600, 680);
    
    _putDontNest(result, 461, 638);
    
    _putDontNest(result, 440, 613);
    
    _putDontNest(result, 631, 673);
    
    _putDontNest(result, 536, 613);
    
    _putDontNest(result, 676, 722);
    
    _putDontNest(result, 733, 701);
    
    _putDontNest(result, 421, 597);
    
    _putDontNest(result, 521, 604);
    
    _putDontNest(result, 360, 550);
    
    _putDontNest(result, 408, 521);
    
    _putDontNest(result, 631, 658);
    
    _putDontNest(result, 416, 687);
    
    _putDontNest(result, 638, 687);
    
    _putDontNest(result, 435, 485);
    
    _putDontNest(result, 600, 701);
    
    _putDontNest(result, 408, 514);
    
    _putDontNest(result, 622, 666);
    
    _putDontNest(result, 557, 743);
    
    _putDontNest(result, 641, 750);
    
    _putDontNest(result, 584, 597);
    
    _putDontNest(result, 597, 701);
    
    _putDontNest(result, 634, 729);
    
    _putDontNest(result, 470, 536);
    
    _putDontNest(result, 421, 571);
    
    _putDontNest(result, 476, 680);
    
    _putDontNest(result, 571, 701);
    
    _putDontNest(result, 360, 604);
    
    _putDontNest(result, 421, 645);
    
    _putDontNest(result, 376, 613);
    
    _putDontNest(result, 604, 694);
    
    _putDontNest(result, 403, 416);
    
    _putDontNest(result, 392, 581);
    
    _putDontNest(result, 607, 743);
    
    _putDontNest(result, 489, 613);
    
    _putDontNest(result, 392, 543);
    
    _putDontNest(result, 521, 550);
    
    _putDontNest(result, 495, 666);
    
    _putDontNest(result, 524, 658);
    
    _putDontNest(result, 613, 631);
    
    _putDontNest(result, 470, 729);
    
    _putDontNest(result, 504, 557);
    
    _putDontNest(result, 584, 645);
    
    _putDontNest(result, 662, 694);
    
    _putDontNest(result, 532, 604);
    
    _putDontNest(result, 408, 638);
    
    _putDontNest(result, 514, 701);
    
    _putDontNest(result, 421, 622);
    
    _putDontNest(result, 625, 701);
    
    _putDontNest(result, 683, 666);
    
    _putDontNest(result, 711, 743);
    
    _putDontNest(result, 550, 557);
    
    _putDontNest(result, 645, 708);
    
    _putDontNest(result, 467, 590);
    
    _putDontNest(result, 593, 666);
    
    _putDontNest(result, 421, 467);
    
    _putDontNest(result, 704, 701);
    
    _putDontNest(result, 479, 729);
    
    _putDontNest(result, 638, 673);
    
    _putDontNest(result, 416, 673);
    
    _putDontNest(result, 697, 743);
    
    _putDontNest(result, 567, 631);
    
    _putDontNest(result, 508, 750);
    
    _putDontNest(result, 452, 743);
    
    _putDontNest(result, 376, 416);
    
    _putDontNest(result, 669, 666);
    
    _putDontNest(result, 479, 536);
    
    _putDontNest(result, 532, 550);
    
    _putDontNest(result, 584, 622);
    
    _putDontNest(result, 546, 543);
    
    _putDontNest(result, 546, 581);
    
    _putDontNest(result, 485, 708);
    
    _putDontNest(result, 403, 613);
    
    _putDontNest(result, 575, 750);
    
    _putDontNest(result, 517, 590);
    
    _putDontNest(result, 532, 666);
    
    _putDontNest(result, 440, 708);
    
    _putDontNest(result, 476, 467);
    
    _putDontNest(result, 495, 550);
    
    _putDontNest(result, 575, 729);
    
    _putDontNest(result, 604, 722);
    
    _putDontNest(result, 445, 557);
    
    _putDontNest(result, 662, 722);
    
    _putDontNest(result, 746, 680);
    
    _putDontNest(result, 470, 750);
    
    _putDontNest(result, 528, 557);
    
    _putDontNest(result, 461, 631);
    
    _putDontNest(result, 658, 715);
    
    _putDontNest(result, 476, 622);
    
    _putDontNest(result, 553, 557);
    
    _putDontNest(result, 725, 673);
    
    _putDontNest(result, 634, 750);
    
    _putDontNest(result, 408, 715);
    
    _putDontNest(result, 498, 708);
    
    _putDontNest(result, 360, 666);
    
    _putDontNest(result, 641, 729);
    
    _putDontNest(result, 543, 708);
    
    _putDontNest(result, 408, 457);
    
    _putDontNest(result, 476, 597);
    
    _putDontNest(result, 581, 613);
    
    _putDontNest(result, 428, 613);
    
    _putDontNest(result, 508, 729);
    
    _putDontNest(result, 416, 485);
    
    _putDontNest(result, 560, 613);
    
    _putDontNest(result, 584, 680);
    
    _putDontNest(result, 435, 687);
    
    _putDontNest(result, 421, 680);
    
    _putDontNest(result, 476, 571);
    
    _putDontNest(result, 408, 528);
    
    _putDontNest(result, 479, 750);
    
    _putDontNest(result, 725, 687);
    
    _putDontNest(result, 367, 416);
    
    _putDontNest(result, 676, 694);
    
    _putDontNest(result, 616, 743);
    
    _putDontNest(result, 521, 666);
    
    _putDontNest(result, 539, 658);
    
    _putDontNest(result, 476, 645);
    
    _putDontNest(result, 593, 604);
    
    _putDontNest(result, 508, 536);
    
    _putDontNest(result, 564, 701);
    
    _putDontNest(result, 435, 673);
    
    _putDontNest(result, 495, 604);
    
    _putDontNest(result, 457, 557);
    
    _putDontNest(result, 367, 613);
    
    _putDontNest(result, 631, 750);
    
    _putDontNest(result, 733, 708);
    
    _putDontNest(result, 641, 658);
    
    _putDontNest(result, 645, 701);
    
    _putDontNest(result, 403, 467);
    
    _putDontNest(result, 489, 597);
    
    _putDontNest(result, 690, 729);
    
    _putDontNest(result, 581, 680);
    
    _putDontNest(result, 536, 597);
    
    _putDontNest(result, 557, 557);
    
    _putDontNest(result, 489, 622);
    
    _putDontNest(result, 376, 622);
    
    _putDontNest(result, 604, 715);
    
    _putDontNest(result, 539, 536);
    
    _putDontNest(result, 495, 590);
    
    _putDontNest(result, 367, 680);
    
    _putDontNest(result, 403, 645);
    
    _putDontNest(result, 508, 658);
    
    _putDontNest(result, 403, 571);
    
    _putDontNest(result, 575, 658);
    
    _putDontNest(result, 408, 445);
    
    _putDontNest(result, 504, 743);
    
    _putDontNest(result, 517, 604);
    
    _putDontNest(result, 550, 743);
    
    _putDontNest(result, 658, 722);
    
    _putDontNest(result, 489, 645);
    
    _putDontNest(result, 421, 613);
    
    _putDontNest(result, 625, 708);
    
    _putDontNest(result, 376, 645);
    
    _putDontNest(result, 514, 708);
    
    _putDontNest(result, 536, 571);
    
    _putDontNest(result, 376, 571);
    
    _putDontNest(result, 704, 708);
    
    _putDontNest(result, 536, 645);
    
    _putDontNest(result, 593, 590);
    
    _putDontNest(result, 467, 666);
    
    _putDontNest(result, 489, 571);
    
    _putDontNest(result, 408, 722);
    
    _putDontNest(result, 376, 597);
    
    _putDontNest(result, 524, 750);
    
    _putDontNest(result, 485, 701);
    
    _putDontNest(result, 360, 440);
    
    _putDontNest(result, 584, 613);
    
    _putDontNest(result, 560, 680);
    
    _putDontNest(result, 428, 680);
    
    _putDontNest(result, 452, 557);
    
    _putDontNest(result, 403, 622);
    
    _putDontNest(result, 517, 550);
    
    _putDontNest(result, 571, 708);
    
    _putDontNest(result, 435, 581);
    
    _putDontNest(result, 536, 622);
    
    _putDontNest(result, 662, 715);
    
    _putDontNest(result, 539, 729);
    
    _putDontNest(result, 435, 543);
    
    _putDontNest(result, 597, 708);
    
    _putDontNest(result, 403, 597);
    
    _putDontNest(result, 600, 708);
    
    _putDontNest(result, 376, 467);
    
    _putDontNest(result, 718, 750);
    
    _putDontNest(result, 408, 476);
    
    _putDontNest(result, 392, 485);
    
    _putDontNest(result, 590, 631);
    
    _putDontNest(result, 718, 729);
    
    _putDontNest(result, 539, 750);
    
    _putDontNest(result, 367, 571);
    
    _putDontNest(result, 634, 658);
    
    _putDontNest(result, 445, 743);
    
    _putDontNest(result, 467, 550);
    
    _putDontNest(result, 498, 701);
    
    _putDontNest(result, 489, 680);
    
    _putDontNest(result, 376, 680);
    
    _putDontNest(result, 360, 590);
    
    _putDontNest(result, 428, 467);
    
    _putDontNest(result, 676, 715);
    
    _putDontNest(result, 392, 687);
    
    _putDontNest(result, 543, 701);
    
    _putDontNest(result, 428, 622);
    
    _putDontNest(result, 367, 645);
    
    _putDontNest(result, 403, 680);
    
    _putDontNest(result, 470, 658);
    
    _putDontNest(result, 690, 750);
    
    _putDontNest(result, 560, 622);
    
    _putDontNest(result, 416, 543);
    
    _putDontNest(result, 524, 729);
    
    _putDontNest(result, 416, 581);
    
    _putDontNest(result, 581, 622);
    
    _putDontNest(result, 479, 504);
    
    _putDontNest(result, 470, 495);
    
    _putDontNest(result, 467, 604);
    
    _putDontNest(result, 367, 597);
    
    _putDontNest(result, 546, 673);
    
    _putDontNest(result, 524, 536);
    
    _putDontNest(result, 521, 590);
    
    _putDontNest(result, 408, 694);
    
    _putDontNest(result, 367, 622);
    
    _putDontNest(result, 428, 645);
    
    _putDontNest(result, 560, 645);
    
    _putDontNest(result, 528, 743);
    
    _putDontNest(result, 631, 729);
    
    _putDontNest(result, 408, 564);
    
    _putDontNest(result, 564, 708);
    
    _putDontNest(result, 479, 495);
    
    _putDontNest(result, 581, 645);
    
    _putDontNest(result, 408, 452);
    
    _putDontNest(result, 517, 666);
    
    _putDontNest(result, 367, 467);
    
    _putDontNest(result, 560, 571);
    
    _putDontNest(result, 392, 673);
    
    _putDontNest(result, 532, 590);
    
    _putDontNest(result, 658, 694);
    
    _putDontNest(result, 428, 571);
    
    _putDontNest(result, 457, 743);
    
    _putDontNest(result, 476, 613);
    
    _putDontNest(result, 479, 658);
    
    _putDontNest(result, 546, 687);
    
    _putDontNest(result, 553, 743);
    
    _putDontNest(result, 604, 638);
    
    _putDontNest(result, 536, 680);
    
    _putDontNest(result, 470, 504);
    
    _putDontNest(result, 560, 597);
    
    _putDontNest(result, 428, 597);
    
    _putDontNest(result, 440, 701);
    
    _putDontNest(result, 408, 440);
    
    _putDontNest(result, 376, 673);
    
    _putDontNest(result, 593, 694);
    
    _putDontNest(result, 392, 680);
    
    _putDontNest(result, 690, 708);
    
    _putDontNest(result, 546, 680);
    
    _putDontNest(result, 536, 687);
    
    _putDontNest(result, 625, 729);
    
    _putDontNest(result, 440, 658);
    
    _putDontNest(result, 403, 673);
    
    _putDontNest(result, 536, 673);
    
    _putDontNest(result, 367, 485);
    
    _putDontNest(result, 567, 557);
    
    _putDontNest(result, 440, 504);
    
    _putDontNest(result, 532, 722);
    
    _putDontNest(result, 571, 536);
    
    _putDontNest(result, 683, 694);
    
    _putDontNest(result, 470, 701);
    
    _putDontNest(result, 543, 658);
    
    _putDontNest(result, 489, 673);
    
    _putDontNest(result, 564, 750);
    
    _putDontNest(result, 733, 729);
    
    _putDontNest(result, 403, 687);
    
    _putDontNest(result, 597, 729);
    
    _putDontNest(result, 476, 581);
    
    _putDontNest(result, 476, 543);
    
    _putDontNest(result, 600, 729);
    
    _putDontNest(result, 467, 715);
    
    _putDontNest(result, 634, 701);
    
    _putDontNest(result, 571, 729);
    
    _putDontNest(result, 360, 722);
    
    _putDontNest(result, 539, 708);
    
    _putDontNest(result, 669, 694);
    
    _putDontNest(result, 550, 631);
    
    _putDontNest(result, 489, 687);
    
    _putDontNest(result, 504, 631);
    
    _putDontNest(result, 514, 536);
    
    _putDontNest(result, 360, 445);
    
    _putDontNest(result, 622, 694);
    
    _putDontNest(result, 376, 687);
    
    _putDontNest(result, 428, 485);
    
    _putDontNest(result, 440, 495);
    
    _putDontNest(result, 416, 613);
    
    _putDontNest(result, 604, 666);
    
    _putDontNest(result, 590, 743);
    
    _putDontNest(result, 514, 729);
    
    _putDontNest(result, 495, 564);
    
    _putDontNest(result, 517, 638);
    
    _putDontNest(result, 498, 658);
    
    _putDontNest(result, 521, 722);
    
    _putDontNest(result, 495, 694);
    
    _putDontNest(result, 360, 476);
    
    _putDontNest(result, 662, 666);
    
    _putDontNest(result, 704, 729);
    
    _putDontNest(result, 479, 701);
    
    _putDontNest(result, 467, 528);
    
    _putDontNest(result, 376, 485);
    
    _putDontNest(result, 631, 708);
    
    _putDontNest(result, 485, 658);
    
    _putDontNest(result, 467, 638);
    
    _putDontNest(result, 521, 694);
    
    _putDontNest(result, 495, 722);
    
    _putDontNest(result, 676, 666);
    
    _putDontNest(result, 421, 581);
    
    _putDontNest(result, 360, 452);
    
    _putDontNest(result, 622, 722);
    
    _putDontNest(result, 571, 750);
    
    _putDontNest(result, 392, 622);
    
    _putDontNest(result, 641, 701);
    
    _putDontNest(result, 597, 750);
    
    _putDontNest(result, 600, 750);
    
    _putDontNest(result, 718, 708);
    
    _putDontNest(result, 467, 514);
    
    _putDontNest(result, 546, 645);
    
    _putDontNest(result, 733, 750);
    
    _putDontNest(result, 564, 729);
    
    _putDontNest(result, 546, 571);
    
    _putDontNest(result, 521, 564);
    
    _putDontNest(result, 593, 722);
    
    _putDontNest(result, 704, 750);
    
    _putDontNest(result, 392, 645);
    
    _putDontNest(result, 421, 543);
    
    _putDontNest(result, 408, 590);
    
    _putDontNest(result, 367, 687);
    
    _putDontNest(result, 532, 694);
    
    _putDontNest(result, 683, 722);
    
    _putDontNest(result, 485, 504);
    
    _putDontNest(result, 581, 673);
    
    _putDontNest(result, 553, 631);
    
    _putDontNest(result, 625, 750);
    
    _putDontNest(result, 428, 673);
    
    _putDontNest(result, 532, 564);
    
    _putDontNest(result, 514, 750);
    
    _putDontNest(result, 392, 571);
    
    _putDontNest(result, 560, 673);
    
    _putDontNest(result, 575, 701);
    
    _putDontNest(result, 669, 722);
    
    _putDontNest(result, 457, 631);
    
    _putDontNest(result, 392, 597);
    
    _putDontNest(result, 517, 715);
    
    _putDontNest(result, 584, 581);
    
    _putDontNest(result, 524, 708);
    
    _putDontNest(result, 546, 622);
    
    _putDontNest(result, 360, 694);
    
    _putDontNest(result, 467, 521);
    
    _putDontNest(result, 528, 631);
    
    _putDontNest(result, 461, 557);
    
    _putDontNest(result, 403, 485);
    
    _putDontNest(result, 508, 701);
    
    _putDontNest(result, 360, 564);
    
    _putDontNest(result, 392, 467);
    
    _putDontNest(result, 564, 536);
    
    _putDontNest(result, 560, 687);
    
    _putDontNest(result, 435, 613);
    
    _putDontNest(result, 645, 658);
    
    _putDontNest(result, 428, 687);
    
    _putDontNest(result, 485, 495);
    
    _putDontNest(result, 445, 631);
    
    _putDontNest(result, 581, 687);
    
    _putDontNest(result, 367, 673);
    
    _putDontNest(result, 546, 597);
    
    _putDontNest(result, 634, 708);
    
    _putDontNest(result, 683, 715);
    
    _putDontNest(result, 607, 631);
    
    _putDontNest(result, 622, 715);
    
    _putDontNest(result, 416, 571);
    
    _putDontNest(result, 476, 485);
    
    _putDontNest(result, 539, 701);
    
    _putDontNest(result, 416, 597);
    
    _putDontNest(result, 746, 673);
    
    _putDontNest(result, 593, 715);
    
    _putDontNest(result, 498, 750);
    
    _putDontNest(result, 435, 680);
    
    _putDontNest(result, 408, 550);
    
    _putDontNest(result, 584, 687);
    
    _putDontNest(result, 440, 750);
    
    _putDontNest(result, 521, 514);
    
    _putDontNest(result, 416, 467);
    
    _putDontNest(result, 360, 638);
    
    _putDontNest(result, 690, 701);
    
    _putDontNest(result, 421, 673);
    
    _putDontNest(result, 485, 729);
    
    _putDontNest(result, 416, 622);
    
    _putDontNest(result, 613, 743);
    
    _putDontNest(result, 428, 581);
    
    _putDontNest(result, 521, 521);
    
    _putDontNest(result, 543, 750);
    
    _putDontNest(result, 560, 543);
    
    _putDontNest(result, 564, 658);
    
    _putDontNest(result, 495, 715);
    
    _putDontNest(result, 560, 581);
    
    _putDontNest(result, 428, 543);
    
    _putDontNest(result, 408, 604);
    
    _putDontNest(result, 532, 638);
    
    _putDontNest(result, 584, 673);
    
    _putDontNest(result, 485, 536);
    
    _putDontNest(result, 479, 708);
    
    _putDontNest(result, 392, 405);
    
    _putDontNest(result, 360, 514);
    
    _putDontNest(result, 746, 687);
    
    _putDontNest(result, 557, 631);
    
    _putDontNest(result, 645, 729);
    
    _putDontNest(result, 517, 722);
    
    _putDontNest(result, 521, 638);
    
    _putDontNest(result, 470, 708);
    
    _putDontNest(result, 416, 645);
    
    _putDontNest(result, 638, 645);
    
    _putDontNest(result, 367, 581);
    
    _putDontNest(result, 495, 528);
    
    _putDontNest(result, 367, 543);
    
    _putDontNest(result, 669, 715);
    
    _putDontNest(result, 421, 687);
    
    _putDontNest(result, 467, 564);
    
    _putDontNest(result, 360, 521);
    
    _putDontNest(result, 567, 743);
    
    _putDontNest(result, 725, 680);
    
    _putDontNest(result, 467, 694);
    
    _putDontNest(result, 452, 631);
    
    _putDontNest(result, 498, 536);
    
    _putDontNest(result, 649, 743);
    
    _putDontNest(result, 360, 457);
    
    _putDontNest(result, 517, 564);
    
    _putDontNest(result, 360, 392);
    
    _putDontNest(result, 435, 597);
    
    _putDontNest(result, 536, 543);
    
    _putDontNest(result, 476, 673);
    
    _putDontNest(result, 593, 638);
    
    _putDontNest(result, 360, 715);
    
    _putDontNest(result, 645, 750);
    
    _putDontNest(result, 435, 571);
    
    _putDontNest(result, 543, 536);
    
    _putDontNest(result, 467, 722);
    
    _putDontNest(result, 421, 485);
    
    _putDontNest(result, 408, 666);
    
    _putDontNest(result, 521, 528);
    
    _putDontNest(result, 571, 658);
    
    _putDontNest(result, 658, 666);
    
    _putDontNest(result, 600, 658);
    
    _putDontNest(result, 517, 694);
    
    _putDontNest(result, 435, 645);
    
    _putDontNest(result, 495, 638);
    
    _putDontNest(result, 597, 658);
    
    _putDontNest(result, 543, 729);
    
    _putDontNest(result, 532, 715);
    
    _putDontNest(result, 461, 743);
    
    _putDontNest(result, 485, 750);
    
    _putDontNest(result, 575, 708);
    
    _putDontNest(result, 495, 514);
    
    _putDontNest(result, 508, 708);
    
    _putDontNest(result, 416, 680);
    
    _putDontNest(result, 638, 680);
    
    _putDontNest(result, 403, 543);
    
    _putDontNest(result, 622, 638);
    
    _putDontNest(result, 403, 581);
    
    _putDontNest(result, 524, 701);
    
    _putDontNest(result, 476, 687);
    
    _putDontNest(result, 546, 613);
    
    _putDontNest(result, 521, 715);
    
    _putDontNest(result, 467, 476);
    
    _putDontNest(result, 495, 521);
    
    _putDontNest(result, 536, 581);
    
    _putDontNest(result, 616, 631);
    
    _putDontNest(result, 435, 622);
    
    _putDontNest(result, 440, 729);
    
    _putDontNest(result, 718, 701);
    
    _putDontNest(result, 376, 543);
    
    _putDontNest(result, 360, 528);
    
    _putDontNest(result, 498, 729);
    
    _putDontNest(result, 641, 708);
    
    _putDontNest(result, 376, 581);
    
    _putDontNest(result, 435, 467);
    
    _putDontNest(result, 514, 658);
    
    _putDontNest(result, 392, 613);
    
    _putDontNest(result, 489, 543);
    
    _putDontNest(result, 489, 581);
    
    _putDontNest(result, 625, 658);
    
    _putDontNest(result, 440, 536);
    
    _putDontNest(result, 631, 701);
    
    _putDontNest(result, 408, 729);
    
    _putDontNest(result, 445, 680);
    
    _putDontNest(result, 461, 581);
    
    _putDontNest(result, 461, 543);
    
    _putDontNest(result, 408, 536);
    
    _putDontNest(result, 504, 571);
    
    _putDontNest(result, 550, 571);
    
    _putDontNest(result, 524, 694);
    
    _putDontNest(result, 575, 715);
    
    _putDontNest(result, 485, 550);
    
    _putDontNest(result, 504, 622);
    
    _putDontNest(result, 470, 638);
    
    _putDontNest(result, 550, 622);
    
    _putDontNest(result, 521, 708);
    
    _putDontNest(result, 658, 729);
    
    _putDontNest(result, 504, 597);
    
    _putDontNest(result, 631, 694);
    
    _putDontNest(result, 641, 715);
    
    _putDontNest(result, 421, 557);
    
    _putDontNest(result, 590, 673);
    
    _putDontNest(result, 485, 604);
    
    _putDontNest(result, 504, 645);
    
    _putDontNest(result, 690, 722);
    
    _putDontNest(result, 718, 694);
    
    _putDontNest(result, 452, 613);
    
    _putDontNest(result, 479, 521);
    
    _putDontNest(result, 470, 514);
    
    _putDontNest(result, 403, 743);
    
    _putDontNest(result, 543, 666);
    
    _putDontNest(result, 557, 613);
    
    _putDontNest(result, 524, 564);
    
    _putDontNest(result, 539, 722);
    
    _putDontNest(result, 479, 514);
    
    _putDontNest(result, 553, 680);
    
    _putDontNest(result, 498, 666);
    
    _putDontNest(result, 536, 743);
    
    _putDontNest(result, 360, 708);
    
    _putDontNest(result, 440, 666);
    
    _putDontNest(result, 470, 521);
    
    _putDontNest(result, 376, 743);
    
    _putDontNest(result, 550, 645);
    
    _putDontNest(result, 489, 743);
    
    _putDontNest(result, 607, 613);
    
    _putDontNest(result, 517, 701);
    
    _putDontNest(result, 528, 680);
    
    _putDontNest(result, 532, 708);
    
    _putDontNest(result, 457, 680);
    
    _putDontNest(result, 550, 597);
    
    _putDontNest(result, 564, 590);
    
    _putDontNest(result, 604, 658);
    
    _putDontNest(result, 479, 638);
    
    _putDontNest(result, 590, 687);
    
    _putDontNest(result, 508, 715);
    
    _putDontNest(result, 553, 571);
    
    _putDontNest(result, 528, 622);
    
    _putDontNest(result, 367, 743);
    
    _putDontNest(result, 457, 622);
    
    _putDontNest(result, 567, 581);
    
    _putDontNest(result, 498, 604);
    
    _putDontNest(result, 575, 638);
    
    _putDontNest(result, 528, 571);
    
    _putDontNest(result, 581, 743);
    
    _putDontNest(result, 524, 722);
    
    _putDontNest(result, 543, 604);
    
    _putDontNest(result, 553, 597);
    
    _putDontNest(result, 539, 694);
    
    _putDontNest(result, 560, 743);
    
    _putDontNest(result, 528, 645);
    
    _putDontNest(result, 457, 571);
    
    _putDontNest(result, 428, 743);
    
    _putDontNest(result, 539, 564);
    
    _putDontNest(result, 645, 666);
    
    _putDontNest(result, 392, 631);
    
    _putDontNest(result, 593, 708);
    
    _putDontNest(result, 498, 550);
    
    _putDontNest(result, 445, 467);
    
    _putDontNest(result, 408, 750);
    
    _putDontNest(result, 479, 528);
    
    _putDontNest(result, 634, 715);
    
    _putDontNest(result, 467, 701);
    
    _putDontNest(result, 457, 597);
    
    _putDontNest(result, 550, 680);
    
    _putDontNest(result, 528, 597);
    
    _putDontNest(result, 683, 708);
    
    _putDontNest(result, 658, 750);
    
    _putDontNest(result, 440, 550);
    
    _putDontNest(result, 445, 622);
    
    _putDontNest(result, 553, 645);
    
    _putDontNest(result, 514, 590);
    
    _putDontNest(result, 631, 722);
    
    _putDontNest(result, 457, 467);
    
    _putDontNest(result, 445, 597);
    
    _putDontNest(result, 546, 631);
    
    _putDontNest(result, 495, 708);
    
    _putDontNest(result, 504, 680);
    
    _putDontNest(result, 567, 543);
    
    _putDontNest(result, 543, 550);
    
    _putDontNest(result, 470, 528);
    
    _putDontNest(result, 553, 622);
    
    _putDontNest(result, 445, 645);
    
    _putDontNest(result, 622, 708);
    
    _putDontNest(result, 476, 557);
    
    _putDontNest(result, 445, 571);
    
    _putDontNest(result, 571, 590);
    
    _putDontNest(result, 479, 715);
    
    _putDontNest(result, 508, 638);
    
    _putDontNest(result, 600, 590);
    
    _putDontNest(result, 718, 722);
    
    _putDontNest(result, 440, 604);
    
    _putDontNest(result, 690, 694);
    
    _putDontNest(result, 669, 708);
    
    _putDontNest(result, 457, 645);
    
    _putDontNest(result, 485, 666);
    
    _putDontNest(result, 470, 715);
    
    _putDontNest(result, 539, 638);
    
    _putDontNest(result, 571, 604);
    
    _putDontNest(result, 746, 743);
    
    _putDontNest(result, 504, 613);
    
    _putDontNest(result, 421, 743);
    
    _putDontNest(result, 616, 680);
    
    _putDontNest(result, 641, 694);
    
    _putDontNest(result, 452, 622);
    
    _putDontNest(result, 631, 715);
    
    _putDontNest(result, 403, 557);
    
    _putDontNest(result, 557, 597);
    
    _putDontNest(result, 584, 743);
    
    _putDontNest(result, 452, 467);
    
    _putDontNest(result, 604, 750);
    
    _putDontNest(result, 543, 590);
    
    _putDontNest(result, 360, 701);
    
    _putDontNest(result, 508, 564);
    
    _putDontNest(result, 376, 557);
    
    _putDontNest(result, 634, 722);
    
    _putDontNest(result, 498, 590);
    
    _putDontNest(result, 508, 694);
    
    _putDontNest(result, 557, 622);
    
    _putDontNest(result, 613, 687);
    
    _putDontNest(result, 489, 557);
    
    _putDontNest(result, 600, 604);
    
    _putDontNest(result, 452, 597);
    
    _putDontNest(result, 607, 622);
    
    _putDontNest(result, 575, 694);
    
    _putDontNest(result, 440, 590);
    
    _putDontNest(result, 360, 421);
    
    _putDontNest(result, 514, 550);
    
    _putDontNest(result, 567, 673);
    
    _putDontNest(result, 536, 557);
    
    _putDontNest(result, 452, 571);
    
    _putDontNest(result, 532, 701);
    
    _putDontNest(result, 470, 722);
    
    _putDontNest(result, 517, 708);
    
    _putDontNest(result, 416, 631);
    
    _putDontNest(result, 676, 729);
    
    _putDontNest(result, 452, 645);
    
    _putDontNest(result, 524, 715);
    
    _putDontNest(result, 564, 666);
    
    _putDontNest(result, 607, 645);
    
    _putDontNest(result, 550, 613);
    
    _putDontNest(result, 567, 687);
    
    _putDontNest(result, 521, 701);
    
    _putDontNest(result, 557, 571);
    
    _putDontNest(result, 613, 673);
    
    _putDontNest(result, 514, 604);
    
    _putDontNest(result, 718, 715);
    
    _putDontNest(result, 571, 550);
    
    _putDontNest(result, 479, 722);
    
    _putDontNest(result, 557, 645);
    
    _putDontNest(result, 662, 750);
    
    _putDontNest(result, 697, 680);
    
    _putDontNest(result, 514, 666);
    
    _putDontNest(result, 690, 715);
    
    _putDontNest(result, 479, 694);
    
    _putDontNest(result, 564, 604);
    
    _putDontNest(result, 676, 750);
    
    _putDontNest(result, 553, 613);
    
    _putDontNest(result, 476, 743);
    
    _putDontNest(result, 616, 645);
    
    _putDontNest(result, 604, 729);
    
    _putDontNest(result, 564, 550);
    
    _putDontNest(result, 634, 694);
    
    _putDontNest(result, 467, 708);
    
    _putDontNest(result, 445, 613);
    
    _putDontNest(result, 470, 564);
    
    _putDontNest(result, 435, 631);
    
    _putDontNest(result, 683, 701);
    
    _putDontNest(result, 616, 622);
    
    _putDontNest(result, 711, 680);
    
    _putDontNest(result, 470, 694);
    
    _putDontNest(result, 625, 666);
    
    _putDontNest(result, 528, 613);
    
    _putDontNest(result, 408, 495);
    
    _putDontNest(result, 479, 564);
    
    _putDontNest(result, 733, 666);
    
    _putDontNest(result, 495, 701);
    
    _putDontNest(result, 457, 613);
    
    _putDontNest(result, 367, 557);
    
    _putDontNest(result, 408, 658);
    
    _putDontNest(result, 557, 680);
    
    _putDontNest(result, 649, 673);
    
    _putDontNest(result, 571, 666);
    
    _putDontNest(result, 461, 687);
    
    _putDontNest(result, 641, 722);
    
    _putDontNest(result, 607, 680);
    
    _putDontNest(result, 597, 666);
    
    _putDontNest(result, 524, 638);
    
    _putDontNest(result, 600, 666);
    
    _putDontNest(result, 622, 701);
    
    _putDontNest(result, 485, 590);
    
    _putDontNest(result, 452, 680);
    
    _putDontNest(result, 428, 557);
    
    _putDontNest(result, 575, 722);
    
    _putDontNest(result, 560, 557);
    
    _putDontNest(result, 669, 701);
    
    _putDontNest(result, 408, 504);
    
    _putDontNest(result, 508, 722);
    
    _putDontNest(result, 662, 729);
    
    _putDontNest(result, 539, 715);
    
    _putDontNest(result, 704, 666);
    
    _putDontNest(result, 631, 638);
    
    _putDontNest(result, 461, 673);
    
    _putDontNest(result, 593, 701);
    
    _putDontNest(result, 408, 428);
    
    _putDontNest(result, 649, 687);
    
    _putDontNest(result, 571, 638);
    
    _putDontNest(result, 498, 564);
    
    _putDontNest(result, 440, 564);
    
    _putDontNest(result, 711, 673);
    
    _putDontNest(result, 658, 701);
    
    _putDontNest(result, 539, 550);
    
    _putDontNest(result, 676, 708);
    
    _putDontNest(result, 553, 581);
    
    _putDontNest(result, 553, 543);
    
    _putDontNest(result, 495, 504);
    
    _putDontNest(result, 597, 638);
    
    _putDontNest(result, 564, 715);
    
    _putDontNest(result, 495, 658);
    
    _putDontNest(result, 524, 666);
    
    _putDontNest(result, 567, 645);
    
    _putDontNest(result, 607, 687);
    
    _putDontNest(result, 600, 638);
    
    _putDontNest(result, 498, 694);
    
    _putDontNest(result, 508, 590);
    
    _putDontNest(result, 461, 680);
    
    _putDontNest(result, 613, 622);
    
    _putDontNest(result, 416, 743);
    
    _putDontNest(result, 638, 743);
    
    _putDontNest(result, 440, 694);
    
    _putDontNest(result, 697, 673);
    
    _putDontNest(result, 575, 590);
    
    _putDontNest(result, 514, 521);
    
    _putDontNest(result, 557, 687);
    
    _putDontNest(result, 567, 571);
    
    _putDontNest(result, 485, 722);
    
    _putDontNest(result, 408, 421);
    
    _putDontNest(result, 590, 613);
    
    _putDontNest(result, 452, 673);
    
    _putDontNest(result, 622, 658);
    
    _putDontNest(result, 495, 495);
    
    _putDontNest(result, 567, 597);
    
    _putDontNest(result, 445, 581);
    
    _putDontNest(result, 645, 722);
    
    _putDontNest(result, 408, 701);
    
    _putDontNest(result, 467, 750);
    
    _putDontNest(result, 445, 543);
    
    _putDontNest(result, 528, 581);
    
    _putDontNest(result, 625, 638);
    
    _putDontNest(result, 557, 673);
    
    _putDontNest(result, 514, 638);
    
    _putDontNest(result, 697, 687);
    
    _putDontNest(result, 528, 543);
    
    _putDontNest(result, 711, 687);
    
    _putDontNest(result, 517, 729);
    
    _putDontNest(result, 613, 645);
    
    _putDontNest(result, 584, 631);
    
    _putDontNest(result, 631, 666);
    
    _putDontNest(result, 567, 622);
    
    _putDontNest(result, 457, 581);
    
    _putDontNest(result, 607, 673);
    
    _putDontNest(result, 485, 476);
    
    _putDontNest(result, 649, 680);
    
    _putDontNest(result, 457, 543);
    
    _putDontNest(result, 718, 666);
    
    _putDontNest(result, 517, 536);
    
    _putDontNest(result, 543, 694);
    
    _putDontNest(result, 421, 631);
    
    _putDontNest(result, 392, 410);
    
    _putDontNest(result, 539, 604);
    
    _putDontNest(result, 514, 514);
    
    _putDontNest(result, 593, 658);
    
    _putDontNest(result, 452, 687);
    
    _putDontNest(result, 543, 564);
    
    _putDontNest(result, 514, 528);
    
    _putDontNest(result, 461, 622);
    
    _putDontNest(result, 452, 485);
    
    _putDontNest(result, 616, 673);
    
    _putDontNest(result, 613, 680);
    
    _putDontNest(result, 392, 557);
    
    _putDontNest(result, 485, 564);
    
    _putDontNest(result, 360, 428);
    
    _putDontNest(result, 645, 694);
    
    _putDontNest(result, 504, 581);
    
    _putDontNest(result, 504, 543);
    
    _putDontNest(result, 662, 708);
    
    _putDontNest(result, 360, 658);
    
    _putDontNest(result, 476, 631);
    
    _putDontNest(result, 467, 536);
    
    _putDontNest(result, 543, 722);
    
    _putDontNest(result, 604, 708);
    
    _putDontNest(result, 546, 557);
    
    _putDontNest(result, 524, 604);
    
    _putDontNest(result, 360, 495);
    
    _putDontNest(result, 690, 666);
    
    _putDontNest(result, 733, 715);
    
    _putDontNest(result, 532, 658);
    
    _putDontNest(result, 514, 715);
    
    _putDontNest(result, 440, 722);
    
    _putDontNest(result, 435, 743);
    
    _putDontNest(result, 485, 694);
    
    _putDontNest(result, 625, 715);
    
    _putDontNest(result, 461, 597);
    
    _putDontNest(result, 704, 715);
    
    _putDontNest(result, 539, 666);
    
    _putDontNest(result, 498, 722);
    
    _putDontNest(result, 521, 658);
    
    _putDontNest(result, 360, 504);
    
    _putDontNest(result, 524, 550);
    
    _putDontNest(result, 461, 571);
    
    _putDontNest(result, 616, 687);
    
    _putDontNest(result, 517, 750);
    
    _putDontNest(result, 461, 645);
    
    _putDontNest(result, 567, 680);
    
    _putDontNest(result, 470, 590);
    
    _putDontNest(result, 725, 743);
    
    _putDontNest(result, 440, 476);
    
    _putDontNest(result, 479, 590);
    
    _putDontNest(result, 600, 715);
    
    _putDontNest(result, 550, 581);
    
    _putDontNest(result, 564, 638);
    
    _putDontNest(result, 597, 715);
    
    _putDontNest(result, 550, 543);
    
    _putDontNest(result, 571, 715);
    
    _putDontNest(result, 467, 729);
    
    _putDontNest(result, 521, 729);
    
    _putDontNest(result, 564, 694);
    
    _putDontNest(result, 408, 708);
    
    _putDontNest(result, 564, 564);
    
    _putDontNest(result, 733, 722);
    
    _putDontNest(result, 597, 722);
    
    _putDontNest(result, 600, 722);
    
    _putDontNest(result, 467, 658);
    
    _putDontNest(result, 485, 638);
    
    _putDontNest(result, 440, 528);
    
    _putDontNest(result, 669, 750);
    
    _putDontNest(result, 470, 550);
    
    _putDontNest(result, 575, 666);
    
    _putDontNest(result, 683, 750);
    
    _putDontNest(result, 504, 687);
    
    _putDontNest(result, 658, 708);
    
    _putDontNest(result, 489, 631);
    
    _putDontNest(result, 479, 604);
    
    _putDontNest(result, 625, 722);
    
    _putDontNest(result, 590, 622);
    
    _putDontNest(result, 514, 722);
    
    _putDontNest(result, 485, 521);
    
    _putDontNest(result, 376, 631);
    
    _putDontNest(result, 440, 715);
    
    _putDontNest(result, 704, 722);
    
    _putDontNest(result, 536, 631);
    
    _putDontNest(result, 498, 715);
    
    _putDontNest(result, 593, 750);
    
    _putDontNest(result, 445, 485);
    
    _putDontNest(result, 676, 701);
    
    _putDontNest(result, 360, 536);
    
    _putDontNest(result, 403, 631);
    
    _putDontNest(result, 495, 750);
    
    _putDontNest(result, 532, 729);
    
    _putDontNest(result, 543, 715);
    
    _putDontNest(result, 485, 514);
    
    _putDontNest(result, 457, 485);
    
    _putDontNest(result, 567, 613);
    
    _putDontNest(result, 470, 604);
    
    _putDontNest(result, 550, 687);
    
    _putDontNest(result, 467, 495);
    
    _putDontNest(result, 532, 536);
    
    _putDontNest(result, 571, 722);
    
    _putDontNest(result, 498, 528);
    
    _putDontNest(result, 622, 750);
    
    _putDontNest(result, 479, 550);
    
    _putDontNest(result, 360, 729);
    
    _putDontNest(result, 641, 666);
    
    _putDontNest(result, 590, 645);
    
    _putDontNest(result, 504, 673);
    
    _putDontNest(result, 550, 673);
    
    _putDontNest(result, 508, 666);
    
    _putDontNest(result, 524, 590);
    
    _putDontNest(result, 521, 536);
    
    _putDontNest(result, 467, 504);
    
    _putDontNest(result, 416, 557);
    
    _putDontNest(result, 367, 435);
    
    _putDontNest(result, 553, 687);
    
    _putDontNest(result, 557, 543);
    
    _putDontNest(result, 435, 557);
    
    _putDontNest(result, 634, 666);
    
    _putDontNest(result, 704, 694);
    
    _putDontNest(result, 514, 694);
    
    _putDontNest(result, 403, 435);
    
    _putDontNest(result, 593, 729);
    
    _putDontNest(result, 376, 435);
    
    _putDontNest(result, 452, 581);
    
    _putDontNest(result, 508, 604);
    
    _putDontNest(result, 571, 564);
    
    _putDontNest(result, 445, 673);
    
    _putDontNest(result, 575, 604);
    
    _putDontNest(result, 597, 694);
    
    _putDontNest(result, 367, 631);
    
    _putDontNest(result, 498, 638);
    
    _putDontNest(result, 600, 694);
    
    _putDontNest(result, 517, 658);
    
    _putDontNest(result, 571, 694);
    
    _putDontNest(result, 546, 743);
    
    _putDontNest(result, 543, 638);
    
    _putDontNest(result, 528, 673);
    
    _putDontNest(result, 557, 581);
    
    _putDontNest(result, 539, 590);
    
    _putDontNest(result, 622, 729);
    
    _putDontNest(result, 457, 673);
    
    _putDontNest(result, 495, 536);
    
    _putDontNest(result, 645, 715);
    
    _putDontNest(result, 360, 750);
    
    _putDontNest(result, 392, 743);
    
    _putDontNest(result, 553, 673);
    
    _putDontNest(result, 428, 631);
    
    _putDontNest(result, 508, 550);
    
    _putDontNest(result, 560, 631);
    
    _putDontNest(result, 498, 521);
    
    _putDontNest(result, 445, 687);
    
    _putDontNest(result, 564, 722);
    
    _putDontNest(result, 581, 631);
    
    _putDontNest(result, 485, 715);
    
    _putDontNest(result, 440, 521);
    
    _putDontNest(result, 470, 666);
    
    _putDontNest(result, 625, 694);
    
    _putDontNest(result, 532, 750);
    
    _putDontNest(result, 514, 564);
    
    _putDontNest(result, 495, 729);
    
    _putDontNest(result, 479, 666);
    
    _putDontNest(result, 457, 687);
    
    _putDontNest(result, 4530, 346);
    
    _putDontNest(result, 498, 514);
    
    _putDontNest(result, 662, 701);
    
    _putDontNest(result, 590, 680);
    
    _putDontNest(result, 733, 694);
    
    _putDontNest(result, 440, 514);
    
    _putDontNest(result, 521, 750);
    
    _putDontNest(result, 528, 687);
    
    _putDontNest(result, 683, 729);
    
    _putDontNest(result, 604, 701);
    
    _putDontNest(result, 452, 543);
    
    _putDontNest(result, 485, 528);
    
    _putDontNest(result, 669, 729);
    
    _putDontNest(result, 440, 638);
    
    _putDontNest(result, 461, 613);
    
    _putDontNest(result, 376, 638);
    
    _putDontNest(result, 408, 613);
    
    _putDontNest(result, 553, 658);
    
    _putDontNest(result, 408, 416);
    
    _putDontNest(result, 445, 658);
    
    _putDontNest(result, 367, 457);
    
    _putDontNest(result, 457, 658);
    
    _putDontNest(result, 546, 666);
    
    _putDontNest(result, 452, 729);
    
    _putDontNest(result, 367, 715);
    
    _putDontNest(result, 428, 528);
    
    _putDontNest(result, 536, 638);
    
    _putDontNest(result, 604, 680);
    
    _putDontNest(result, 445, 504);
    
    _putDontNest(result, 476, 694);
    
    _putDontNest(result, 528, 658);
    
    _putDontNest(result, 489, 638);
    
    _putDontNest(result, 476, 564);
    
    _putDontNest(result, 613, 708);
    
    _putDontNest(result, 584, 722);
    
    _putDontNest(result, 403, 521);
    
    _putDontNest(result, 590, 701);
    
    _putDontNest(result, 376, 514);
    
    _putDontNest(result, 421, 722);
    
    _putDontNest(result, 452, 536);
    
    _putDontNest(result, 467, 485);
    
    _putDontNest(result, 489, 514);
    
    _putDontNest(result, 662, 680);
    
    _putDontNest(result, 616, 750);
    
    _putDontNest(result, 367, 392);
    
    _putDontNest(result, 593, 581);
    
    _putDontNest(result, 457, 495);
    
    _putDontNest(result, 517, 687);
    
    _putDontNest(result, 711, 729);
    
    _putDontNest(result, 697, 729);
    
    _putDontNest(result, 479, 743);
    
    _putDontNest(result, 489, 521);
    
    _putDontNest(result, 557, 536);
    
    _putDontNest(result, 445, 495);
    
    _putDontNest(result, 746, 722);
    
    _putDontNest(result, 403, 514);
    
    _putDontNest(result, 376, 521);
    
    _putDontNest(result, 470, 743);
    
    _putDontNest(result, 485, 631);
    
    _putDontNest(result, 581, 715);
    
    _putDontNest(result, 567, 708);
    
    _putDontNest(result, 495, 581);
    
    _putDontNest(result, 428, 715);
    
    _putDontNest(result, 367, 528);
    
    _putDontNest(result, 560, 715);
    
    _putDontNest(result, 495, 543);
    
    _putDontNest(result, 392, 666);
    
    _putDontNest(result, 421, 476);
    
    _putDontNest(result, 557, 729);
    
    _putDontNest(result, 517, 673);
    
    _putDontNest(result, 634, 743);
    
    _putDontNest(result, 539, 557);
    
    _putDontNest(result, 4151, 326);
    
    _putDontNest(result, 435, 590);
    
    _putDontNest(result, 403, 638);
    
    _putDontNest(result, 607, 729);
    
    _putDontNest(result, 457, 504);
    
    _putDontNest(result, 504, 658);
    
    _putDontNest(result, 376, 392);
    
    _putDontNest(result, 367, 514);
    
    _putDontNest(result, 360, 581);
    
    _putDontNest(result, 392, 604);
    
    _putDontNest(result, 581, 638);
    
    _putDontNest(result, 367, 521);
    
    _putDontNest(result, 532, 581);
    
    _putDontNest(result, 376, 457);
    
    _putDontNest(result, 604, 645);
    
    _putDontNest(result, 616, 729);
    
    _putDontNest(result, 376, 715);
    
    _putDontNest(result, 440, 631);
    
    _putDontNest(result, 489, 715);
    
    _putDontNest(result, 746, 694);
    
    _putDontNest(result, 416, 590);
    
    _putDontNest(result, 461, 708);
    
    _putDontNest(result, 575, 743);
    
    _putDontNest(result, 467, 673);
    
    _putDontNest(result, 604, 622);
    
    _putDontNest(result, 403, 528);
    
    _putDontNest(result, 546, 604);
    
    _putDontNest(result, 524, 557);
    
    _putDontNest(result, 508, 743);
    
    _putDontNest(result, 452, 750);
    
    _putDontNest(result, 584, 694);
    
    _putDontNest(result, 607, 750);
    
    _putDontNest(result, 360, 543);
    
    _putDontNest(result, 376, 528);
    
    _putDontNest(result, 489, 528);
    
    _putDontNest(result, 476, 722);
    
    _putDontNest(result, 550, 658);
    
    _putDontNest(result, 560, 638);
    
    _putDontNest(result, 641, 743);
    
    _putDontNest(result, 557, 750);
    
    _putDontNest(result, 428, 638);
    
    _putDontNest(result, 504, 504);
    
    _putDontNest(result, 546, 550);
    
    _putDontNest(result, 532, 543);
    
    _putDontNest(result, 428, 514);
    
    _putDontNest(result, 676, 680);
    
    _putDontNest(result, 467, 687);
    
    _putDontNest(result, 421, 564);
    
    _putDontNest(result, 649, 708);
    
    _putDontNest(result, 543, 631);
    
    _putDontNest(result, 403, 715);
    
    _putDontNest(result, 421, 694);
    
    _putDontNest(result, 521, 543);
    
    _putDontNest(result, 392, 550);
    
    _putDontNest(result, 403, 457);
    
    _putDontNest(result, 428, 521);
    
    _putDontNest(result, 521, 581);
    
    _putDontNest(result, 697, 750);
    
    _putDontNest(result, 536, 715);
    
    _putDontNest(result, 498, 631);
    
    _putDontNest(result, 711, 750);
    
    _putDontNest(result, 367, 638);
    
    _putDontNest(result, 504, 495);
    
    _putDontNest(result, 476, 476);
    
    _putDontNest(result, 476, 715);
    
    _putDontNest(result, 550, 729);
    
    _putDontNest(result, 403, 476);
    
    _putDontNest(result, 550, 536);
    
    _putDontNest(result, 421, 521);
    
    _putDontNest(result, 467, 581);
    
    _putDontNest(result, 479, 557);
    
    _putDontNest(result, 367, 452);
    
    _putDontNest(result, 590, 708);
    
    _putDontNest(result, 408, 467);
    
    _putDontNest(result, 445, 750);
    
    _putDontNest(result, 467, 543);
    
    _putDontNest(result, 571, 631);
    
    _putDontNest(result, 367, 564);
    
    _putDontNest(result, 376, 476);
    
    _putDontNest(result, 600, 631);
    
    _putDontNest(result, 532, 687);
    
    _putDontNest(result, 367, 694);
    
    _putDontNest(result, 408, 622);
    
    _putDontNest(result, 597, 631);
    
    _putDontNest(result, 408, 597);
    
    _putDontNest(result, 5565, 564);
    
    _putDontNest(result, 360, 673);
    
    _putDontNest(result, 416, 550);
    
    _putDontNest(result, 457, 750);
    
    _putDontNest(result, 725, 666);
    
    _putDontNest(result, 421, 638);
    
    _putDontNest(result, 521, 687);
    
    _putDontNest(result, 567, 701);
    
    _putDontNest(result, 470, 557);
    
    _putDontNest(result, 504, 729);
    
    _putDontNest(result, 528, 750);
    
    _putDontNest(result, 392, 590);
    
    _putDontNest(result, 581, 694);
    
    _putDontNest(result, 560, 564);
    
    _putDontNest(result, 532, 673);
    
    _putDontNest(result, 428, 564);
    
    _putDontNest(result, 536, 722);
    
    _putDontNest(result, 539, 743);
    
    _putDontNest(result, 560, 694);
    
    _putDontNest(result, 616, 658);
    
    _putDontNest(result, 428, 694);
    
    _putDontNest(result, 408, 645);
    
    _putDontNest(result, 408, 571);
    
    _putDontNest(result, 489, 722);
    
    _putDontNest(result, 476, 528);
    
    _putDontNest(result, 403, 445);
    
    _putDontNest(result, 584, 638);
    
    _putDontNest(result, 504, 536);
    
    _putDontNest(result, 376, 722);
    
    _putDontNest(result, 514, 631);
    
    _putDontNest(result, 625, 631);
    
    _putDontNest(result, 435, 666);
    
    _putDontNest(result, 553, 750);
    
    _putDontNest(result, 421, 514);
    
    _putDontNest(result, 521, 673);
    
    _putDontNest(result, 546, 590);
    
    _putDontNest(result, 690, 743);
    
    _putDontNest(result, 416, 604);
    
    _putDontNest(result, 403, 722);
    
    _putDontNest(result, 613, 701);
    
    _putDontNest(result, 376, 445);
    
    _putDontNest(result, 360, 687);
    
    _putDontNest(result, 536, 694);
    
    _putDontNest(result, 553, 729);
    
    _putDontNest(result, 718, 743);
    
    _putDontNest(result, 553, 536);
    
    _putDontNest(result, 517, 581);
    
    _putDontNest(result, 428, 476);
    
    _putDontNest(result, 669, 673);
    
    _putDontNest(result, 550, 750);
    
    _putDontNest(result, 560, 722);
    
    _putDontNest(result, 376, 452);
    
    _putDontNest(result, 445, 536);
    
    _putDontNest(result, 536, 564);
    
    _putDontNest(result, 428, 722);
    
    _putDontNest(result, 683, 673);
    
    _putDontNest(result, 524, 743);
    
    _putDontNest(result, 581, 722);
    
    _putDontNest(result, 564, 631);
    
    _putDontNest(result, 403, 564);
    
    _putDontNest(result, 528, 536);
    
    _putDontNest(result, 360, 485);
    
    _putDontNest(result, 421, 715);
    
    _putDontNest(result, 403, 694);
    
    _putDontNest(result, 669, 687);
    
    _putDontNest(result, 452, 495);
    
    _putDontNest(result, 435, 604);
    
    _putDontNest(result, 495, 673);
    
    _putDontNest(result, 403, 452);
    
    _putDontNest(result, 457, 536);
    
    _putDontNest(result, 367, 722);
    
    _putDontNest(result, 504, 750);
    
    _putDontNest(result, 528, 729);
    
    _putDontNest(result, 683, 687);
    
    _putDontNest(result, 631, 743);
    
    _putDontNest(result, 517, 543);
    
    _putDontNest(result, 593, 687);
    
    _putDontNest(result, 584, 715);
    
    _putDontNest(result, 649, 701);
    
    _putDontNest(result, 476, 521);
    
    _putDontNest(result, 452, 658);
    
    _putDontNest(result, 457, 729);
    
    _putDontNest(result, 622, 673);
    
    _putDontNest(result, 607, 658);
    
    _putDontNest(result, 367, 445);
    
    _putDontNest(result, 452, 504);
    
    _putDontNest(result, 658, 680);
    
    _putDontNest(result, 495, 687);
    
    _putDontNest(result, 445, 729);
    
    _putDontNest(result, 476, 514);
    
    _putDontNest(result, 435, 550);
    
    _putDontNest(result, 408, 680);
    
    _putDontNest(result, 421, 528);
    
    _putDontNest(result, 557, 658);
    
    _putDontNest(result, 604, 613);
    
    _putDontNest(result, 489, 564);
    
    _putDontNest(result, 638, 666);
    
    _putDontNest(result, 622, 687);
    
    _putDontNest(result, 376, 694);
    
    _putDontNest(result, 416, 666);
    
    _putDontNest(result, 367, 476);
    
    _putDontNest(result, 476, 638);
    
    _putDontNest(result, 489, 694);
    
    _putDontNest(result, 746, 715);
    
    _putDontNest(result, 461, 701);
    
    _putDontNest(result, 376, 564);
    
    _putDontNest(result, 508, 557);
    
    _putDontNest(result, 593, 673);
    
    _putDontNest(result, 392, 694);
    
    _putDontNest(result, 725, 715);
    
    _putDontNest(result, 532, 645);
    
    _putDontNest(result, 600, 743);
    
    _putDontNest(result, 403, 440);
    
    _putDontNest(result, 517, 613);
    
    _putDontNest(result, 733, 743);
    
    _putDontNest(result, 593, 680);
    
    _putDontNest(result, 435, 715);
    
    _putDontNest(result, 416, 521);
    
    _putDontNest(result, 625, 743);
    
    _putDontNest(result, 360, 571);
    
    _putDontNest(result, 590, 729);
    
    _putDontNest(result, 514, 743);
    
    _putDontNest(result, 550, 708);
    
    _putDontNest(result, 461, 504);
    
    _putDontNest(result, 521, 622);
    
    _putDontNest(result, 711, 701);
    
    _putDontNest(result, 532, 597);
    
    _putDontNest(result, 683, 680);
    
    _putDontNest(result, 421, 604);
    
    _putDontNest(result, 704, 743);
    
    _putDontNest(result, 360, 645);
    
    _putDontNest(result, 697, 701);
    
    _putDontNest(result, 539, 631);
    
    _putDontNest(result, 584, 604);
    
    _putDontNest(result, 428, 590);
    
    _putDontNest(result, 669, 680);
    
    _putDontNest(result, 485, 557);
    
    _putDontNest(result, 392, 564);
    
    _putDontNest(result, 532, 571);
    
    _putDontNest(result, 376, 440);
    
    _putDontNest(result, 452, 701);
    
    _putDontNest(result, 560, 590);
    
    _putDontNest(result, 649, 658);
    
    _putDontNest(result, 658, 673);
    
    _putDontNest(result, 360, 597);
    
    _putDontNest(result, 408, 673);
    
    _putDontNest(result, 557, 701);
    
    _putDontNest(result, 597, 743);
    
    _putDontNest(result, 521, 571);
    
    _putDontNest(result, 546, 564);
    
    _putDontNest(result, 546, 694);
    
    _putDontNest(result, 360, 622);
    
    _putDontNest(result, 571, 743);
    
    _putDontNest(result, 622, 680);
    
    _putDontNest(result, 435, 528);
    
    _putDontNest(result, 421, 550);
    
    _putDontNest(result, 607, 701);
    
    _putDontNest(result, 638, 638);
    
    _putDontNest(result, 416, 638);
    
    _putDontNest(result, 360, 467);
    
    _putDontNest(result, 461, 495);
    
    _putDontNest(result, 521, 645);
    
    _putDontNest(result, 476, 666);
    
    _putDontNest(result, 416, 514);
    
    _putDontNest(result, 408, 687);
    
    _putDontNest(result, 532, 622);
    
    _putDontNest(result, 521, 597);
    
    _putDontNest(result, 367, 590);
    
    _putDontNest(result, 461, 658);
    
    _putDontNest(result, 658, 687);
    
    _putDontNest(result, 495, 680);
    
    _putDontNest(result, 504, 708);
    
    _putDontNest(result, 546, 722);
    
    _putDontNest(result, 543, 557);
    
    _putDontNest(result, 495, 571);
    
    _putDontNest(result, 495, 597);
    
    _putDontNest(result, 616, 701);
    
    _putDontNest(result, 613, 658);
    
    _putDontNest(result, 495, 622);
    
    _putDontNest(result, 593, 597);
    
    _putDontNest(result, 498, 557);
    
    _putDontNest(result, 489, 590);
    
    _putDontNest(result, 440, 557);
    
    _putDontNest(result, 622, 645);
    
    _putDontNest(result, 593, 622);
    
    _putDontNest(result, 521, 680);
    
    _putDontNest(result, 467, 613);
    
    _putDontNest(result, 408, 485);
    
    _putDontNest(result, 435, 514);
    
    _putDontNest(result, 392, 476);
    
    _putDontNest(result, 421, 666);
    
    _putDontNest(result, 367, 440);
    
    _putDontNest(result, 476, 550);
    
    _putDontNest(result, 590, 750);
    
    _putDontNest(result, 445, 708);
    
    _putDontNest(result, 524, 631);
    
    _putDontNest(result, 564, 743);
    
    _putDontNest(result, 528, 708);
    
    _putDontNest(result, 532, 680);
    
    _putDontNest(result, 457, 708);
    
    _putDontNest(result, 746, 666);
    
    _putDontNest(result, 638, 715);
    
    _putDontNest(result, 416, 715);
    
    _putDontNest(result, 435, 521);
    
    _putDontNest(result, 553, 708);
    
    _putDontNest(result, 360, 680);
    
    _putDontNest(result, 376, 590);
    
    _putDontNest(result, 476, 604);
    
    _putDontNest(result, 536, 590);
    
    _putDontNest(result, 392, 722);
    
    _putDontNest(result, 593, 645);
    
    _putDontNest(result, 567, 658);
    
    _putDontNest(result, 495, 645);
    
    _putDontNest(result, 435, 638);
    
    _putDontNest(result, 403, 590);
    
    _putDontNest(result, 416, 528);
    
    _putDontNest(result, 584, 666);
    
    _putDontNest(result, 560, 666);
    
    _putDontNest(result, 403, 604);
    
    _putDontNest(result, 435, 564);
    
    _putDontNest(result, 376, 604);
    
    _putDontNest(result, 392, 528);
    
    _putDontNest(result, 607, 708);
    
    _putDontNest(result, 571, 557);
    
    _putDontNest(result, 532, 613);
    
    _putDontNest(result, 649, 750);
    
    _putDontNest(result, 416, 476);
    
    _putDontNest(result, 367, 666);
    
    _putDontNest(result, 504, 701);
    
    _putDontNest(result, 550, 701);
    
    _putDontNest(result, 376, 550);
    
    _putDontNest(result, 697, 708);
    
    _putDontNest(result, 676, 687);
    
    _putDontNest(result, 360, 416);
    
    _putDontNest(result, 428, 666);
    
    _putDontNest(result, 517, 571);
    
    _putDontNest(result, 452, 708);
    
    _putDontNest(result, 581, 666);
    
    _putDontNest(result, 638, 722);
    
    _putDontNest(result, 416, 722);
    
    _putDontNest(result, 485, 743);
    
    _putDontNest(result, 470, 631);
    
    _putDontNest(result, 517, 645);
    
    _putDontNest(result, 461, 750);
    
    _putDontNest(result, 613, 729);
    
    _putDontNest(result, 435, 694);
    
    _putDontNest(result, 676, 673);
    
    _putDontNest(result, 360, 613);
    
    _putDontNest(result, 479, 631);
    
    _putDontNest(result, 489, 604);
    
    _putDontNest(result, 557, 708);
    
    _putDontNest(result, 476, 590);
    
    _putDontNest(result, 567, 536);
    
    _putDontNest(result, 536, 604);
    
    _putDontNest(result, 403, 550);
    
    _putDontNest(result, 517, 622);
    
    _putDontNest(result, 567, 729);
    
    _putDontNest(result, 546, 715);
    
    _putDontNest(result, 521, 613);
    
    _putDontNest(result, 725, 694);
    
    _putDontNest(result, 467, 680);
    
    _putDontNest(result, 489, 550);
    
    _putDontNest(result, 514, 557);
    
    _putDontNest(result, 536, 550);
    
    _putDontNest(result, 392, 715);
    
    _putDontNest(result, 517, 597);
    
    _putDontNest(result, 711, 708);
    
    _putDontNest(result, 645, 743);
    
    _putDontNest(result, 408, 581);
    
    _putDontNest(result, 616, 708);
    
    _putDontNest(result, 564, 557);
    
    _putDontNest(result, 649, 729);
    
    _putDontNest(result, 467, 645);
    
    _putDontNest(result, 604, 687);
    
    _putDontNest(result, 662, 673);
    
    _putDontNest(result, 367, 550);
    
    _putDontNest(result, 392, 638);
    
    _putDontNest(result, 461, 536);
    
    _putDontNest(result, 421, 590);
    
    _putDontNest(result, 445, 701);
    
    _putDontNest(result, 408, 543);
    
    _putDontNest(result, 467, 467);
    
    _putDontNest(result, 528, 701);
    
    _putDontNest(result, 428, 550);
    
    _putDontNest(result, 517, 680);
    
    _putDontNest(result, 392, 521);
    
    _putDontNest(result, 560, 550);
    
    _putDontNest(result, 508, 631);
    
    _putDontNest(result, 567, 750);
    
    _putDontNest(result, 4530, 323);
    
    _putDontNest(result, 367, 604);
    
    _putDontNest(result, 662, 687);
    
    _putDontNest(result, 575, 631);
    
    _putDontNest(result, 457, 701);
    
    _putDontNest(result, 495, 613);
    
    _putDontNest(result, 725, 722);
    
    _putDontNest(result, 467, 597);
    
    _putDontNest(result, 416, 564);
    
    _putDontNest(result, 489, 666);
    
    _putDontNest(result, 553, 701);
    
    _putDontNest(result, 440, 743);
    
    _putDontNest(result, 638, 694);
    
    _putDontNest(result, 376, 666);
    
    _putDontNest(result, 416, 694);
    
    _putDontNest(result, 467, 571);
    
    _putDontNest(result, 435, 722);
    
    _putDontNest(result, 536, 666);
    
    _putDontNest(result, 498, 743);
    
    _putDontNest(result, 546, 638);
    
    _putDontNest(result, 590, 658);
    
    _putDontNest(result, 543, 743);
    
    _putDontNest(result, 403, 666);
    
    _putDontNest(result, 428, 604);
    
    _putDontNest(result, 584, 590);
    
    _putDontNest(result, 613, 750);
    
    _putDontNest(result, 461, 729);
    
    _putDontNest(result, 560, 604);
    
    _putDontNest(result, 604, 673);
    
    _putDontNest(result, 467, 622);
    
    _putDontNest(result, 392, 514);
    
    _putDontNest(result, 593, 613);
    
    _putDontNest(result, 435, 476);
   return result;
  }
    
  protected static IntegerMap _initDontNestGroups() {
    IntegerMap result = new IntegerMap();
    int resultStoreId = result.size();
    
    
    ++resultStoreId;
    
    result.putUnsafe(461, resultStoreId);
    result.putUnsafe(504, resultStoreId);
    result.putUnsafe(495, resultStoreId);
    result.putUnsafe(479, resultStoreId);
    result.putUnsafe(470, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(360, resultStoreId);
    result.putUnsafe(376, resultStoreId);
    result.putUnsafe(367, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(452, resultStoreId);
    result.putUnsafe(467, resultStoreId);
    result.putUnsafe(485, resultStoreId);
    result.putUnsafe(440, resultStoreId);
    result.putUnsafe(416, resultStoreId);
    result.putUnsafe(435, resultStoreId);
    result.putUnsafe(428, resultStoreId);
    result.putUnsafe(421, resultStoreId);
    result.putUnsafe(476, resultStoreId);
    result.putUnsafe(457, resultStoreId);
    result.putUnsafe(445, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(645, resultStoreId);
    result.putUnsafe(634, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(649, resultStoreId);
    result.putUnsafe(641, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(408, resultStoreId);
    result.putUnsafe(403, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(733, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(593, resultStoreId);
    result.putUnsafe(600, resultStoreId);
    result.putUnsafe(575, resultStoreId);
    result.putUnsafe(584, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(392, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(567, resultStoreId);
    result.putUnsafe(557, resultStoreId);
    result.putUnsafe(550, resultStoreId);
    result.putUnsafe(553, resultStoreId);
    result.putUnsafe(517, resultStoreId);
    result.putUnsafe(532, resultStoreId);
    result.putUnsafe(571, resultStoreId);
    result.putUnsafe(564, resultStoreId);
    result.putUnsafe(543, resultStoreId);
    result.putUnsafe(508, resultStoreId);
    result.putUnsafe(539, resultStoreId);
    result.putUnsafe(524, resultStoreId);
    result.putUnsafe(546, resultStoreId);
    result.putUnsafe(536, resultStoreId);
    result.putUnsafe(560, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(658, resultStoreId);
    result.putUnsafe(676, resultStoreId);
    result.putUnsafe(662, resultStoreId);
    result.putUnsafe(704, resultStoreId);
    result.putUnsafe(690, resultStoreId);
    result.putUnsafe(718, resultStoreId);
    result.putUnsafe(725, resultStoreId);
    result.putUnsafe(746, resultStoreId);
    result.putUnsafe(697, resultStoreId);
    result.putUnsafe(711, resultStoreId);
    result.putUnsafe(683, resultStoreId);
    result.putUnsafe(669, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(528, resultStoreId);
    result.putUnsafe(521, resultStoreId);
    result.putUnsafe(514, resultStoreId);
    result.putUnsafe(498, resultStoreId);
    result.putUnsafe(489, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(5565, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4530, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(613, resultStoreId);
    result.putUnsafe(616, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(654, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(590, resultStoreId);
    result.putUnsafe(607, resultStoreId);
    result.putUnsafe(604, resultStoreId);
    result.putUnsafe(597, resultStoreId);
    result.putUnsafe(581, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(631, resultStoreId);
    result.putUnsafe(638, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(622, resultStoreId);
    result.putUnsafe(625, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4151, resultStoreId);
      
    return result;
  }
  
  protected boolean hasNestingRestrictions(java.lang.String name){
		return (_dontNest.size() != 0); // TODO Make more specific.
  }
    
  protected IntegerList getFilteredParents(int childId) {
		return _dontNest.get(childId);
  }
    
  // initialize priorities     
  static {
    _dontNest = _initDontNest();
    _resultStoreIdMappings = _initDontNestGroups();
  }
    
  // Production declarations
	
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJQYXJhbVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4MCw4MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Param\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00 = (IConstructor) _read("prod(label(\"binXor\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"^\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiEiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDMzLDMzKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"!\"),[\\char-class([range(33,33)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiU3RyaW5nIildLHt0YWcoImNhdGVnb3J5IigiU3RyaW5nIikpfSk00 = (IConstructor) _read("prod(sort(\"Literal\"),[lex(\"String\")],{tag(\"category\"(\"String\"))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHBvcnQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"export\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpKSxbc29ydCgiUHJvcGVydHlOYW1lIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"property\",sort(\"PropertyAssignment\")),[sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBvcnQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"import\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRoaXMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"this\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(115,115)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBsZW1lbnRzIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"implements\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSxbY29uZGl0aW9uYWwoXGl0ZXItc3RhcihcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKX0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionFlags\"),[conditional(\\iter-star(\\char-class([range(65,90),range(97,122)])),{\\not-follow(\\char-class([range(65,90),range(97,122)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIkFyZ0V4cHJlc3Npb25cIiksW2xpdChcIixcIildKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"ArgExpression\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(114,114)]),\\char-class([range(103,103)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcm90ZWN0ZWQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"protected\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiU3RhdGVtZW50IikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgiY2xhc3MiKSxleGNlcHQoImZ1bmN0aW9uIil9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"expression\",sort(\"Statement\")),[conditional(sort(\"Expression\"),{except(\"class\"),except(\"function\")}),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQYXJhbSIpLFtsZXgoIklkIildLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Param\"),[lex(\"Id\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihvcHQobGV4KCJFeHBvbmVudFBhcnQiKSkp = (IConstructor) _read("regular(opt(lex(\"ExponentPart\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpLHJhbmdlKDM5LDM5KSxyYW5nZSg5Miw5MikscmFuZ2UoOTgsOTgpLHJhbmdlKDEwMiwxMDIpLHJhbmdlKDExMCwxMTApLHJhbmdlKDExNCwxMTQpLHJhbmdlKDExNiwxMTYpLHJhbmdlKDExOCwxMTgpXSldLHt9KQ0000 = (IConstructor) _read("prod(lex(\"SingleEscapeCharacter\"),[\\char-class([range(34,34),range(39,39),range(92,92),range(98,98),range(102,102),range(110,110),range(114,114),range(116,116),range(118,118)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIioiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQyLDQyKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"*\"),[\\char-class([range(42,42)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkhleEludGVnZXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OCw4OCkscmFuZ2UoMTIwLDEyMCldKSxjb25kaXRpb25hbChpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0se30p = (IConstructor) _read("prod(lex(\"HexInteger\"),[\\char-class([range(48,48)]),\\char-class([range(88,88),range(120,120)]),conditional(iter(\\char-class([range(48,57),range(65,70),range(97,102)])),{\\not-follow(\\char-class([range(65,90),range(95,95),range(97,122)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm5ldyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKV0se30p = (IConstructor) _read("prod(lit(\"new\"),[\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(119,119)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImludGVyZmFjZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"interface\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[conditional(\\char-class([range(48,48)]),{\\not-follow(\\char-class([range(48,57)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJQcm9wZXJ0eU5hbWVcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"PropertyName\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(78,78)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTb3VyY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU291cmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTb3VyY2UiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Source\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Source\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Source\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImV4dGVuZHMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"extends\"),[\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(115,115)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4MCw4MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"Param\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic3dpdGNoQ2FzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInN3aXRjaCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNvbmQiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoInsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNsYXVzZXMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJDYXNlQ2xhdXNlIiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"switchCase\",sort(\"Statement\")),[lit(\"switch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"clauses\",\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CharacterEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CharacterEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"CharacterEscapeSequence\")))})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DbGFzc0NoYXIiKSkp = (IConstructor) _read("regular(\\iter-star(lex(\"RegularExpressionClassChar\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXD5cPiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKGxlZnQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"shr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"\\>\\>\"),{\\not-follow(\\char-class([range(62,62)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNob3J0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"short\"),[\\char-class([range(115,115)]),\\char-class([range(104,104)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11XD4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p = (IConstructor) _read("prod(lit(\"\\>\\>\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInZhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE4LDExOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"var\"),[\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(114,114)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKFxcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDUyLDUyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Niw1NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NSw1NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(48,57)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"RegularExpressionChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibmVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiIT0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p = (IConstructor) _read("prod(label(\"neq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"!=\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibm90Iixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIiEiKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"not\",sort(\"Expression\")),[conditional(lit(\"!\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"int\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJDb21tZW50Q2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"CommentChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTdGF0ZW1lbnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Statement\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInN5bmNocm9uaXplZCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMiwxMjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"synchronized\"),[\\char-class([range(115,115)]),\\char-class([range(121,121)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(122,122)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidGhyb3dOb0V4cCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRocm93IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00 = (IConstructor) _read("prod(label(\"throwNoExp\",sort(\"Statement\")),[lit(\"throw\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJlRGVjciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCItLSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"preDecr\",sort(\"Expression\")),[lit(\"--\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidHJ5Q2F0Y2giLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0cnkiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiY2F0Y2giKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"tryCatch\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"catch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiUHJvcGVydHlBc3NpZ25tZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00 = (IConstructor) _read("regular(\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIn4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNiwxMjYpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"~\"),[\\char-class([range(126,126)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW3NvcnQoIlVuaWNvZGVFc2NhcGVTZXF1ZW5jZSIpXSx7fSk00 = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[sort(\"UnicodeEscapeSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicmV0dXJuTm9FeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJyZXR1cm4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"returnNoExp\",sort(\"Statement\")),[lit(\"return\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzgsNzgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"NonEscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTEFZT1VUIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"LAYOUT\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"LAYOUT\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"LAYOUT\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pKX0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"CommentChar\"),[conditional(\\char-class([range(42,42)]),{\\not-follow(\\char-class([range(47,47)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"RegularExpressionChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"RegularExpressionChar\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYmluTmVnIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIn4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00 = (IConstructor) _read("prod(label(\"binNeg\",sort(\"Expression\")),[lit(\"~\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiRG91YmxlU3RyaW5nQ2hhciIpKSk00 = (IConstructor) _read("regular(\\iter-star(lex(\"DoubleStringChar\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmdW5jdGlvbiIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"function\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImFic3RyYWN0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"abstract\"),[\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJDYXNlQ2xhdXNlXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"CaseClause\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiY9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzOCwzOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"&=\"),[\\char-class([range(38,38)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgib2JqZWN0RGVmaW5pdGlvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxvcHQobGl0KCIsIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p = (IConstructor) _read("prod(label(\"objectDefinition\",sort(\"Expression\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInByb3RlY3RlZCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"protected\"),[\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJEZWNpbWFsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"Decimal\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKV0se30p = (IConstructor) _read("prod(lex(\"DecimalInteger\"),[\\char-class([range(48,48)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkVzY2FwZVNlcXVlbmNlIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"EscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"EscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"EscapeSequence\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkb3VibGUiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"double\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYnJlYWtOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiYnJlYWsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"breakNoLabel\",sort(\"Statement\")),[lit(\"break\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXhwb25lbnRQYXJ0IikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"ExponentPart\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ExponentPart\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"ExponentPart\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImluIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"in\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzd2l0Y2giKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"switch\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIndpdGgiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExOSwxMTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"with\"),[\\char-class([range(119,119)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(104,104)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"=\"),[\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlN0cmluZyIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU3RyaW5nIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"String\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"String\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"String\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInx8IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"||\"),[\\char-class([range(124,124)]),\\char-class([range(124,124)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionFirstChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionFirstChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionFirstChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduU2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignShrr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"[\"),[\\char-class([range(91,91)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicG9zdEluY3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIrKyIpXSx7fSk00 = (IConstructor) _read("prod(label(\"postIncr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"++\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aGlsZSIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"while\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIio9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"*=\"),[\\char-class([range(42,42)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXNlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"case\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"shrr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>\\>\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkZ1bmN0aW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"function\",sort(\"Expression\")),[sort(\"Function\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbc29ydCgiTnVtZXJpYyIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"PropertyName\"),[sort(\"Numeric\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2YXIiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"var\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKFxcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwxNjc3NzIxNSldKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0OSw0OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NCw1NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NSw1NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTAsNTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Myw1MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(1,9),range(11,16777215)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(49,49)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(54,54)]),\\char-class([range(55,55)]),\\char-class([range(55,55)]),\\char-class([range(55,55)]),\\char-class([range(50,50)]),\\char-class([range(49,49)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKV0se30p = (IConstructor) _read("prod(label(\"property\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\".\"),layouts(\"LAYOUTLIST\"),lex(\"Id\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm9wdChcXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NCw1NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NCw1NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"opt(\\\\char-class([range(61,61)]))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJTdHJpbmciKV0se30p = (IConstructor) _read("prod(sort(\"PropertyName\"),[lex(\"String\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRyYW5zaWVudCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"transient\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiVW5pY29kZUVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"UnicodeEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"UnicodeEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"UnicodeEscapeSequence\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRyeSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKV0se30p = (IConstructor) _read("prod(lit(\"try\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(121,121)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGb3JCaW5kaW5nIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkZvckJpbmRpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkZvckJpbmRpbmciKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"ForBinding\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ForBinding\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"ForBinding\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImRlbGV0ZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p = (IConstructor) _read("prod(lit(\"delete\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQYXJhbSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Param\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"Param\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Param\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleERpZ2l0IikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleERpZ2l0XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleERpZ2l0IikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexDigit\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexDigit\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexDigit\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiE9PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzMsMzMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p = (IConstructor) _read("prod(lit(\"!==\"),[\\char-class([range(33,33)]),\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDQxKSxyYW5nZSg0Myw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[\\char-class([range(1,9),range(11,41),range(43,46),range(48,90),range(93,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eU5hbWUiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlOYW1lXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eU5hbWUiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyName\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"PropertyName\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"PropertyName\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb25zdCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"const\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkFyZ0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"ArgExpression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ArgExpression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"ArgExpression\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiaXRlcihcXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57)])),[\\char-class([range(0,0)]),lit(\"iter(\\\\char-class([range(48,57)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(iter(\\char-class([range(48,57)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJEb3VibGVTdHJpbmdDaGFyXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"DoubleStringChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdXBlciIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"super\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlByb3BlcnR5QXNzaWdubWVudFwiKSxbbGl0KFwiLFwiKV0pIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"PropertyAssignment\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQYXJhbXMiKSxbbGFiZWwoImxzdCIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlBhcmFtIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSldLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Params\"),[label(\"lst\",\\iter-star-seps(sort(\"Param\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidHlwZW9mIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoInR5cGVvZiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"typeof\",sort(\"Expression\")),[lit(\"typeof\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000 = (IConstructor) _read("regular(\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionClassChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZm9ySW5EZWNsYXJhdGlvbiIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImZvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRGVjbGFyYXRvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJGb3JCaW5kaW5nIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"forInDeclaration\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Declarator\"),layouts(\"LAYOUTLIST\"),sort(\"ForBinding\"),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),label(\"obj\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp = (IConstructor) _read("regular(\\iter-star(\\char-class([range(48,57)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIisrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"++\"),[\\char-class([range(43,43)]),\\char-class([range(43,43)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiYmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzOCwzOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"&&\"),[\\char-class([range(38,38)]),\\char-class([range(38,38)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiSGV4SW50ZWdlciIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Numeric\"),[conditional(lex(\"HexInteger\"),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImRlZmF1bHQiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"default\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjaGFyIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"char\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleEVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexEscapeSequence\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJQYXJhbXNcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"Params\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZm9yRG8iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kcyIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkV4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJvcHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p = (IConstructor) _read("prod(label(\"forDo\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"conds\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"ops\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25Cb2R5IikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionBody\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionBody\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionBody\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkZpcnN0Q2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3MCw3MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionFirstChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(70,70)]),\\char-class([range(105,105)]),\\char-class([range(114,114)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkV4cG9uZW50UGFydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpLHJhbmdlKDEwMSwxMDEpXSksbGV4KCJTaWduZWRJbnRlZ2VyIildLHt9KQ0000 = (IConstructor) _read("prod(lex(\"ExponentPart\"),[\\char-class([range(69,69),range(101,101)]),lex(\"SignedInteger\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU3RhdGVtZW50XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Statement\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"Statement\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw8XDwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYwLDYwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKV0se30p = (IConstructor) _read("prod(lit(\"\\<\\<\"),[\\char-class([range(60,60)]),\\char-class([range(60,60)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZXEiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCI9PSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00 = (IConstructor) _read("prod(label(\"eq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"==\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwzMykscmFuZ2UoMzUsMzgpLHJhbmdlKDQwLDQ3KSxyYW5nZSg1OCw5MSkscmFuZ2UoOTMsOTcpLHJhbmdlKDk5LDEwMSkscmFuZ2UoMTAzLDEwOSkscmFuZ2UoMTExLDExMykscmFuZ2UoMTE1LDExNSkscmFuZ2UoMTE5LDExOSkscmFuZ2UoMTIxLDE2Nzc3MjE1KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"NonEscapeCharacter\"),[\\char-class([range(1,9),range(11,33),range(35,38),range(40,47),range(58,91),range(93,97),range(99,101),range(103,109),range(111,113),range(115,115),range(119,119),range(121,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTb3VyY2VcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Source\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkV4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkV4cHJlc3Npb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Expression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Expression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Expression\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJDaGFyYWN0ZXJFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMywxMTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"CharacterEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXRjaCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"catch\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJBcmdFeHByZXNzaW9uIiksW3NvcnQoIkV4cHJlc3Npb24iKV0se30p = (IConstructor) _read("prod(sort(\"ArgExpression\"),[sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDkxKSxyYW5nZSg5NCwxNjc3NzIxNSldKV0se30p = (IConstructor) _read("prod(lex(\"RegularExpressionClassChar\"),[\\char-class([range(1,9),range(11,91),range(94,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibGl0ZXJhbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiTGl0ZXJhbCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"literal\",sort(\"Expression\")),[sort(\"Literal\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJEZWNsYXJhdG9yIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2xhcmF0b3JcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkRlY2xhcmF0b3IiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Declarator\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Declarator\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Declarator\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLG9wdChsZXgoIkV4cG9uZW50UGFydCIpKV0se30p = (IConstructor) _read("prod(lex(\"Decimal\"),[lex(\"DecimalInteger\"),opt(lex(\"ExponentPart\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNvbnN0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"const\"),[\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKFxcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MCw1MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(65,90),range(97,122)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInw9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p = (IConstructor) _read("prod(lit(\"|=\"),[\\char-class([range(124,124)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNCwxMjQpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"|\"),[\\char-class([range(124,124)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihzZXEoW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkse1xub3QtcHJlY2VkZShcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldKSk00 = (IConstructor) _read("regular(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})]))", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp = (IConstructor) _read("regular(iter(\\char-class([range(48,57)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRocm93IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"throw\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJEZWNsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhckRlY2xcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhckRlY2wiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VarDecl\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VarDecl\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VarDecl\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibmVxcSIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiE9PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p = (IConstructor) _read("prod(label(\"neqq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"!==\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImRlYnVnZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p = (IConstructor) _read("prod(lit(\"debugger\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(98,98)]),\\char-class([range(117,117)]),\\char-class([range(103,103)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduU3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignSub\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"-=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cmFuc2llbnQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"transient\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm51bGwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"null\"),[\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(108,108)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0eXBlb2YiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"typeof\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"u\"),[\\char-class([range(117,117)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInN3aXRjaCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"switch\"),[\\char-class([range(115,115)]),\\char-class([range(119,119)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKV0se30p = (IConstructor) _read("prod(lex(\"RegularExpressionBody\"),[lex(\"RegularExpressionFirstChar\"),\\iter-star(lex(\"RegularExpressionChar\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzcsMzcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"rem\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"%\"),{\\not-follow(\\char-class([range(37,37),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJDb21tZW50Q2hhclwiKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"CommentChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"div\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"/\"),{\\not-follow(\\char-class([range(47,47),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"sub\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"-\"),{\\not-follow(\\char-class([range(45,45),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aGlzIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"this\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDQ1LDQ1KV0pKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIm9wdChcXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKSxyYW5nZSg0NSw0NSldKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKG9wdChcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDQ1LDQ1KV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(43,43),range(45,45)])),[\\char-class([range(0,0)]),lit(\"opt(\\\\char-class([range(43,43),range(45,45)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(\\char-class([range(43,43),range(45,45)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYXlvdXRzKCJMQVlPVVRMSVNUIiksW2NvbmRpdGlvbmFsKFxpdGVyLXN0YXIobGV4KCJMQVlPVVQiKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg5LDEwKSxyYW5nZSgzMiwzMildKSksXG5vdC1mb2xsb3cobGl0KCIvLyIpKSxcbm90LWZvbGxvdyhsaXQoIi8qIikpfSldLHt9KQ0000 = (IConstructor) _read("prod(layouts(\"LAYOUTLIST\"),[conditional(\\iter-star(lex(\"LAYOUT\")),{\\not-follow(\\char-class([range(9,10),range(32,32)])),\\not-follow(lit(\"//\")),\\not-follow(lit(\"/*\"))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNsYXNzIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"class\"),[\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aXRoIiksbGl0KCJhYnN0cmFjdCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"with\"),lit(\"abstract\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclaration\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VariableDeclaration\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VariableDeclaration\")))})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00 = (IConstructor) _read("regular(\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKSk00 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(65,90),range(97,122)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduQmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignBinAnd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"&=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvdyIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"throw\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJDYXNlQ2xhdXNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"CaseClause\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkp = (IConstructor) _read("regular(iter(\\char-class([range(48,57),range(65,70),range(97,102)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJWYXJEZWNsIiksW3NvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImRlY2xhcmF0aW9ucyIsXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"VarDecl\"),[sort(\"Declarator\"),layouts(\"LAYOUTLIST\"),label(\"declarations\",\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJWYXJEZWNsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"VarDecl\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIldoaXRlc3BhY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDksMTApLHJhbmdlKDEzLDEzKSxyYW5nZSgzMiwzMildKV0se30p = (IConstructor) _read("prod(lex(\"Whitespace\"),[\\char-class([range(9,10),range(13,13),range(32,32)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNykscmFuZ2UoMTIwLDEyMCldKV0se30p = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[\\char-class([range(117,117),range(120,120)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionClass\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p = (IConstructor) _read("prod(lex(\"DoubleStringChar\"),[\\char-class([range(92,92)]),lex(\"EscapeSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlBc3NpZ25tZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyAssignment\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"PropertyAssignment\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"PropertyAssignment\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25DbGFzcyIpXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[lex(\"RegularExpressionClass\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaWZUaGVuIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiaWYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kIixzb3J0KCJFeHByZXNzaW9uIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGVtcHR5KCkse1xub3QtZm9sbG93KGxpdCgiZWxzZSIpKX0pXSx7fSk00 = (IConstructor) _read("prod(label(\"ifThen\",sort(\"Statement\")),[lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),conditional(empty(),{\\not-follow(lit(\"else\"))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNhdGNoIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"catch\"),[\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Niw3NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjUsNjUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg5LDg5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3OSw3OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODUsODUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg0LDg0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"LAYOUT\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSk00 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImltcGxlbWVudHMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"implements\"),[\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(115,115)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZGVmYXVsdENhc2UiLHNvcnQoIkNhc2VDbGF1c2UiKSksW2xpdCgiZGVmYXVsdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p = (IConstructor) _read("prod(label(\"defaultCase\",sort(\"CaseClause\")),[lit(\"default\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p = (IConstructor) _read("prod(label(\"binAnd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"&\"),{\\not-follow(\\char-class([range(38,38),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZhbHNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p = (IConstructor) _read("prod(lit(\"false\"),[\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvLyIpLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMTY3NzcyMTUpXSkpLHtcZW5kLW9mLWxpbmUoKX0pXSx7dGFnKCJjYXRlZ29yeSIoIkNvbW1lbnQiKSl9KQ0000 = (IConstructor) _read("prod(lex(\"Comment\"),[lit(\"//\"),conditional(\\iter-star(\\char-class([range(1,9),range(11,16777215)])),{\\end-of-line()})],{tag(\"category\"(\"Comment\"))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiYiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDM4LDM4KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"&\"),[\\char-class([range(38,38)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzgpLHJhbmdlKDQwLDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p = (IConstructor) _read("prod(lex(\"SingleStringChar\"),[\\char-class([range(1,9),range(11,38),range(40,91),range(93,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTaWduZWRJbnRlZ2VyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"SignedInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(100,100)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIkV4cHJlc3Npb25cIiksW2xpdChcIixcIildKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"Expression\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInR5cGVvZiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p = (IConstructor) _read("prod(lit(\"typeof\"),[\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(111,111)]),\\char-class([range(102,102)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm5hdGl2ZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"native\"),[\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(118,118)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11XD5cPiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p = (IConstructor) _read("prod(lit(\"\\>\\>\\>\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(62,62)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJlZml4UGx1cyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwobGl0KCIrIikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se30p = (IConstructor) _read("prod(label(\"prefixPlus\",sort(\"Expression\")),[conditional(lit(\"+\"),{\\not-follow(\\char-class([range(43,43),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDcwKSxyYW5nZSg5NywxMDIpXSkpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiaXRlcihcXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KSxyYW5nZSg2NSw3MCkscmFuZ2UoOTcsMTAyKV0pKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDcwKSxyYW5nZSg5NywxMDIpXSkpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57),range(65,70),range(97,102)])),[\\char-class([range(0,0)]),lit(\"iter(\\\\char-class([range(48,57),range(65,70),range(97,102)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(iter(\\char-class([range(48,57),range(65,70),range(97,102)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJJZCIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"PropertyName\"),[lex(\"Id\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJEb3VibGVTdHJpbmdDaGFyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"DoubleStringChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIndoaWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"while\"),[\\char-class([range(119,119)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJTaW5nbGVTdHJpbmdDaGFyXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"SingleStringChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgib3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8fCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"or\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"||\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpZ25lZEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2lnbmVkSW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaWduZWRJbnRlZ2VyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SignedInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SignedInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SignedInteger\")))})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiUGFyYW0iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000 = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Param\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\";\"),[\\char-class([range(59,59)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZGVidWdnZXIiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJkZWJ1Z2dlciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjsiKV0se30p = (IConstructor) _read("prod(label(\"debugger\",sort(\"Statement\")),[lit(\"debugger\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm9wdChcXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKSxyYW5nZSg0NSw0NSldKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUxLDUxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUxLDUxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"opt(\\\\char-class([range(43,43),range(45,45)]))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(51,51)]),\\char-class([range(44,44)]),\\char-class([range(52,52)]),\\char-class([range(51,51)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(52,52)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi09IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"-=\"),[\\char-class([range(45,45)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIklkIiksW2NvbmRpdGlvbmFsKHNlcShbY29uZGl0aW9uYWwoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSx7XG5vdC1wcmVjZWRlKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0pLHtkZWxldGUoa2V5d29yZHMoIlJlc2VydmVkIikpfSldLHt9KQ0000 = (IConstructor) _read("prod(lex(\"Id\"),[conditional(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})]),{delete(keywords(\"Reserved\"))})],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp = (IConstructor) _read("regular(\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihlbXB0eSgpKQ0000 = (IConstructor) _read("regular(empty())", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgib3B0KFxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihvcHQoXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(61,61)])),[\\char-class([range(0,0)]),lit(\"opt(\\\\char-class([range(61,61)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(\\char-class([range(61,61)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzYsNzYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OSw4OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzksNzkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg1LDg1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4NCw4NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"LAYOUT\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiQ29tbWVudENoYXIiKSkp = (IConstructor) _read("regular(\\iter-star(lex(\"CommentChar\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJsb25nIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"long\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Niw0NildKSxcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksb3B0KGxleCgiRXhwb25lbnRQYXJ0IikpXSx7fSk00 = (IConstructor) _read("prod(lex(\"Decimal\"),[lex(\"DecimalInteger\"),\\char-class([range(46,46)]),\\iter-star(\\char-class([range(48,57)])),opt(lex(\"ExponentPart\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdGF0aWMiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"static\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidGhyb3dFeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0aHJvdyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"throwExp\",sort(\"Statement\")),[lit(\"throw\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwdWJsaWMiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"public\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKV0se30p = (IConstructor) _read("prod(lex(\"RegularExpression\"),[\\char-class([range(47,47)]),lex(\"RegularExpressionBody\"),\\char-class([range(47,47)]),lex(\"RegularExpressionFlags\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRydWUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"true\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgid2hpbGVEbyIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"whileDo\",sort(\"Statement\")),[lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduU2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignShr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000 = (IConstructor) _read("prod(lex(\"CharacterEscapeSequence\"),[lex(\"NonEscapeCharacter\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmbG9hdCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"float\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihvcHQoXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKSk00 = (IConstructor) _read("regular(opt(\\char-class([range(61,61)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIob3B0KGxleCgiRXhwb25lbnRQYXJ0IikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"ExponentPart\")),[\\char-class([range(0,0)]),lit(\"opt(sort(\\\"ExponentPart\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(lex(\"ExponentPart\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODIsODIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjYsNjYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionBody\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(66,66)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(121,121)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvd3MiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"throws\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidGhpcyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ0aGlzIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"this\",sort(\"Expression\")),[lit(\"this\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJJZFwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"Id\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(73,73)]),\\char-class([range(100,100)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYnJlYWtMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImJyZWFrIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"breakLabel\",sort(\"Statement\")),[lit(\"break\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3RhcihcXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXJyYXkiLHNvcnQoIkV4cHJlc3Npb24iKSksW2xpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLG9wdChsaXQoIiwiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00 = (IConstructor) _read("prod(label(\"array\",sort(\"Expression\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJOdW1lcmljIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk51bWVyaWNcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk51bWVyaWMiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Numeric\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Numeric\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Numeric\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicmV0dXJuRXhwIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgicmV0dXJuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00 = (IConstructor) _read("prod(label(\"returnExp\",sort(\"Statement\")),[lit(\"return\"),layouts(\"LAYOUTLIST\"),label(\"exp\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJCb29sZWFuIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkJvb2xlYW5cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkJvb2xlYW4iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Boolean\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Boolean\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Boolean\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"{\"),[\\char-class([range(123,123)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXNlcHMoc29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclaration\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-seps(sort(\\\"VariableDeclaration\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibWVtYmVyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00 = (IConstructor) _read("prod(label(\"member\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidmFyRGVjbCIsc29ydCgiU3RhdGVtZW50IikpLFtzb3J0KCJWYXJEZWNsIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"varDecl\",sort(\"Statement\")),[sort(\"VarDecl\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJOdW1lcmljXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"Numeric\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(78,78)]),\\char-class([range(117,117)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(99,99)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSk00 = (IConstructor) _read("regular(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"EscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNvbW1lbnRDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNvbW1lbnRDaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CommentChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CommentChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"CommentChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJCb29sZWFuXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY2LDY2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"Boolean\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(66,66)]),\\char-class([range(111,111)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNvbnRpbnVlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p = (IConstructor) _read("prod(lit(\"continue\"),[\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWZhdWx0IildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"default\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuZXciKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"new\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p = (IConstructor) _read("prod(lit(\"for\"),[\\char-class([range(102,102)]),\\char-class([range(111,111)]),\\char-class([range(114,114)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYXlvdXRzKCIkZGVmYXVsdCQiKSxbXSx7fSk00 = (IConstructor) _read("prod(layouts(\"$default$\"),[],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWxldGUiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"delete\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj8iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00 = (IConstructor) _read("prod(label(\"cond\",sort(\"Expression\")),[conditional(sort(\"Expression\"),{except(\"cond\")}),layouts(\"LAYOUTLIST\"),lit(\"?\"),layouts(\"LAYOUTLIST\"),conditional(sort(\"Expression\"),{except(\"cond\")}),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduU2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPD0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignShl\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\\<=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJJbml0aWFsaXplciIpLFtsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"Initializer\"),[lit(\"=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY2LDY2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionBackslashSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(66,66)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(107,107)]),\\char-class([range(115,115)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(104,104)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnkiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"try\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"mul\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"*\"),{\\not-follow(\\char-class([range(42,42),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduRGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignDiv\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"/=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiRGVjaW1hbCIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Numeric\"),[conditional(lex(\"Decimal\"),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiY29udGludWVOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiY29udGludWUiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"continueNoLabel\",sort(\"Statement\")),[lit(\"continue\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvKiIpLFxpdGVyLXN0YXIobGV4KCJDb21tZW50Q2hhciIpKSxsaXQoIiovIildLHt0YWcoImNhdGVnb3J5IigiQ29tbWVudCIpKX0p = (IConstructor) _read("prod(lex(\"Comment\"),[lit(\"/*\"),\\iter-star(lex(\"CommentChar\")),lit(\"*/\")],{tag(\"category\"(\"Comment\"))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduTXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignMul\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"*=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJNZXRob2REZWZpbml0aW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc3LDc3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"MethodDefinition\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(77,77)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25DbGFzc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClass\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionClass\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionClass\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNhc2VDbGF1c2VcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkNhc2VDbGF1c2UiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"CaseClause\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CaseClause\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"CaseClause\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcml2YXRlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"private\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInZvaWQiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"void\"),[\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(105,105)]),\\char-class([range(100,100)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKQ0000 = (IConstructor) _read("regular(\\iter-star(lex(\"RegularExpressionChar\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"PropertyAssignment\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DoubleStringChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"DoubleStringChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"DoubleStringChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnVlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"true\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJiYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MobGVmdCgpKX0p = (IConstructor) _read("prod(label(\"and\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"&&\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2xhdGlsZSIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"volatile\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionBackslashSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionBackslashSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionBackslashSequence\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImVsc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"else\"),[\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclarationNoIn\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VariableDeclarationNoIn\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VariableDeclarationNoIn\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgidHJ1ZSIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"Boolean\"),[lit(\"true\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleEscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SingleEscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SingleEscapeCharacter\")))})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pKSk00 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(1,9),range(11,16777215)])))", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKQ0000 = (IConstructor) _read("regular(\\iter-star(lex(\"LAYOUT\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoXFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(48,57)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(48,57)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Expression\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"Expression\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p = (IConstructor) _read("prod(lit(\"char\"),[\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJIZXhEaWdpdFwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"HexDigit\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(68,68)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJudWxsIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"null\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibmV3Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"new\",sort(\"Expression\")),[lit(\"new\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbGx5IildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"finally\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJEZWNpbWFsSW50ZWdlclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"DecimalInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClassChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionClassChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionClassChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2lkIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"void\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJGb3JCaW5kaW5nIiksW2xleCgiSWQiKV0se30p = (IConstructor) _read("prod(sort(\"ForBinding\"),[lex(\"Id\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\":\"),[\\char-class([range(58,58)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi8vIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"//\"),[\\char-class([range(47,47)]),\\char-class([range(47,47)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiUmVndWxhckV4cHJlc3Npb24iKV0se30p = (IConstructor) _read("prod(sort(\"Literal\"),[lex(\"RegularExpression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIldoaXRlc3BhY2UiKV0se30p = (IConstructor) _read("prod(lex(\"LAYOUT\"),[lex(\"Whitespace\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclarationNoIn\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-seps(sort(\\\"VariableDeclarationNoIn\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzksMzkpXSksXGl0ZXItc3RhcihsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM5LDM5KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"String\"),[\\char-class([range(39,39)]),\\iter-star(lex(\"SingleStringChar\")),\\char-class([range(39,39)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIml0ZXIoXFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU2LDU2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"iter(\\\\char-class([range(48,57)]))\"),[\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiovIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"*/\"),[\\char-class([range(42,42)]),\\char-class([range(47,47)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihvcHQobGl0KCIsIikpKQ0000 = (IConstructor) _read("regular(opt(lit(\",\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJlZml4TWluIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIi0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KSxyYW5nZSg2MSw2MSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00 = (IConstructor) _read("prod(label(\"prefixMin\",sort(\"Expression\")),[conditional(lit(\"-\"),{\\not-follow(\\char-class([range(45,45),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIj09IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"==\"),[\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduQWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignAdd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"+=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJXaGl0ZXNwYWNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg3LDg3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"Whitespace\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(87,87)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(112,112)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImV4cG9ydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"export\"),[\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNhc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p = (IConstructor) _read("prod(lit(\"case\"),[\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKV0se30p = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[lex(\"RegularExpressionClass\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw8XDw9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjAsNjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\<\\<=\"),[\\char-class([range(60,60)]),\\char-class([range(60,60)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInN0YXRpYyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"static\"),[\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25GbGFnc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionFlags\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionFlags\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionFlags\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"EscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduUmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignRem\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"%=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRocm93cyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKV0se30p = (IConstructor) _read("prod(lit(\"throws\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(115,115)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChlbXB0eSgpLFtdLHt9KQ0000 = (IConstructor) _read("prod(empty(),[],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"-\"),[\\char-class([range(45,45)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"set\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGl0ZXItc3RhcihsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"String\"),[\\char-class([range(34,34)]),\\iter-star(lex(\"DoubleStringChar\")),\\char-class([range(34,34)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNlcShbXFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKFwiTEFZT1VUTElTVFwiKSxvcHQoXFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzYsNzYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OSw4OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzksNzkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg1LDg1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4NCw4NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzYsNzYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDczLDczKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODQsODQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"seq([\\\\char-class([range(61,61)]),layouts(\\\"LAYOUTLIST\\\"),opt(\\\\char-class([range(61,61)]))])\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(121,121)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(116,116)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(76,76)]),\\char-class([range(73,73)]),\\char-class([range(83,83)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTaW5nbGVTdHJpbmdDaGFyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"SingleStringChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiU2luZ2xlU3RyaW5nQ2hhciIpKSk00 = (IConstructor) _read("regular(\\iter-star(lex(\"SingleStringChar\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJyZXR1cm4iKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"return\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMiwxMjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"Initializer\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(122,122)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicG9zdERlYyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi0tIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"postDec\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"--\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmYWxzZSIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"false\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgiZmFsc2UiKV0se30p = (IConstructor) _read("prod(sort(\"Boolean\"),[lit(\"false\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJMSFNFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc2LDc2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"LHSExpression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(72,72)]),\\char-class([range(83,83)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhclwiKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"RegularExpressionClassChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnN0YW5jZW9mIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"instanceof\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInBhY2thZ2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA3LDEwNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"package\"),[\\char-class([range(112,112)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(107,107)]),\\char-class([range(97,97)]),\\char-class([range(103,103)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU3RhdGVtZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTdGF0ZW1lbnQiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Statement\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Statement\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Statement\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbHNlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"else\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbiIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"in\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImludCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"int\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnRlcmZhY2UiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"interface\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgic2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiUGFyYW0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p = (IConstructor) _read("prod(sort(\"MethodDefinition\"),[lit(\"set\"),layouts(\"LAYOUTLIST\"),sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Param\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJGb3JCaW5kaW5nXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDcwLDcwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Niw2NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"ForBinding\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(70,70)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(66,66)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgwLDgwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"ExponentPart\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCJ8Iikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSkscmFuZ2UoMTI0LDEyNCldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"binOr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"|\"),{\\not-follow(\\char-class([range(61,61),range(124,124)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkhleERpZ2l0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKV0se30p = (IConstructor) _read("prod(lex(\"HexDigit\"),[\\char-class([range(48,57),range(65,70),range(97,102)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsaXQoIiwiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJvcHQobGl0KFwiLFwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKG9wdChsaXQoIiwiKSkpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lit(\",\")),[\\char-class([range(0,0)]),lit(\"opt(lit(\\\",\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(lit(\",\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw8PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjAsNjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\<=\"),[\\char-class([range(60,60)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIldoaXRlc3BhY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiV2hpdGVzcGFjZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJXaGl0ZXNwYWNlIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Whitespace\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Whitespace\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Whitespace\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZ2VxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD49IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000 = (IConstructor) _read("prod(label(\"geq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpXSx7fSk00 = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[lex(\"SingleEscapeCharacter\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpZiIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"if\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbnVtIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"enum\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"LAYOUT\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"LAYOUT\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"LAYOUT\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\".\"),[\\char-class([range(46,46)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImV4cCIsc29ydCgiRXhwcmVzc2lvbiIpKV0se30p = (IConstructor) _read("prod(label(\"init\",sort(\"VariableDeclaration\")),[label(\"id\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"exp\",sort(\"Expression\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionBackslashSequence\"),[\\char-class([range(92,92)]),\\char-class([range(1,9),range(11,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImJ5dGUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"byte\"),[\\char-class([range(98,98)]),\\char-class([range(121,121)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDM3LDM3KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"%\"),[\\char-class([range(37,37)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzeW5jaHJvbml6ZWQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"synchronized\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJieXRlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"byte\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiY2FsbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKV0se30p = (IConstructor) _read("prod(label(\"call\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInN1cGVyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"super\"),[\\char-class([range(115,115)]),\\char-class([range(117,117)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihvcHQoXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKSxyYW5nZSg0NSw0NSldKSkp = (IConstructor) _read("regular(opt(\\char-class([range(43,43),range(45,45)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZpbmFsIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKV0se30p = (IConstructor) _read("prod(lit(\"final\"),[\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJnb3RvIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"goto\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3MCw3MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"Function\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(70,70)]),\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbXMiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUGFyYW1zXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQYXJhbXMiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Params\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Params\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Params\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p = (IConstructor) _read("prod(lit(\"\\>\"),[\\char-class([range(62,62)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"final\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjbGFzcyIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"class\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000 = (IConstructor) _read("prod(lex(\"CharacterEscapeSequence\"),[lex(\"SingleEscapeCharacter\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMaXRlcmFsIiksW2xpdCgibnVsbCIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"Literal\"),[lit(\"null\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJTdGF0ZW1lbnRcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"Statement\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImVudW0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"enum\"),[\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(109,109)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw8IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKV0se30p = (IConstructor) _read("prod(lit(\"\\<\"),[\\char-class([range(60,60)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OSw1NyldKSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSl9KV0se30p = (IConstructor) _read("prod(lex(\"DecimalInteger\"),[\\char-class([range(49,57)]),conditional(\\iter-star(\\char-class([range(48,57)])),{\\not-follow(\\char-class([range(48,57)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMaXRlcmFsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxpdGVyYWxcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxpdGVyYWwiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Literal\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Literal\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Literal\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImlmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"if\"),[\\char-class([range(105,105)]),\\char-class([range(102,102)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKV0se30p = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"/\"),[\\char-class([range(47,47)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWxJbnRlZ2VyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2ltYWxJbnRlZ2VyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkRlY2ltYWxJbnRlZ2VyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DecimalInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"DecimalInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"DecimalInteger\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZW1wdHkiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"empty\",sort(\"Statement\")),[lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXNjYXBlQ2hhcmFjdGVyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"EscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"EscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"EscapeCharacter\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImltcG9ydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"import\"),[\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaWZUaGVuRWxzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImlmIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImVsc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"ifThenElse\",sort(\"Statement\")),[lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"else\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\")\"),[\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiSGV4RXNjYXBlU2VxdWVuY2UiKV0se30p = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[lex(\"HexEscapeSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgid2l0aCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndpdGgiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJzY29wZSIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"with\",sort(\"Statement\")),[lit(\"with\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"scope\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJBcmdFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"ArgExpression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(114,114)]),\\char-class([range(103,103)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlNpZ25lZEludGVnZXIiKSxbb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNDUsNDUpXSkpLGNvbmRpdGlvbmFsKGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"SignedInteger\"),[opt(\\char-class([range(43,43),range(45,45)])),conditional(iter(\\char-class([range(48,57)])),{\\not-follow(\\char-class([range(48,57)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIkNvbW1lbnQiKV0se30p = (IConstructor) _read("prod(lex(\"LAYOUT\"),[lex(\"Comment\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzdGFydChzb3J0KCJTb3VyY2UiKSksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgidG9wIixzb3J0KCJTb3VyY2UiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpXSx7fSk00 = (IConstructor) _read("prod(start(sort(\"Source\")),[layouts(\"LAYOUTLIST\"),label(\"top\",sort(\"Source\")),layouts(\"LAYOUTLIST\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"SingleEscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb250aW51ZSIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"continue\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidHJ5Q2F0Y2hGaW5hbGx5Iixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgidHJ5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImNhdGNoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"tryCatchFinally\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"catch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"finally\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZ1bmN0aW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p = (IConstructor) _read("prod(lit(\"function\"),[\\char-class([range(102,102)]),\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZpbmFsbHkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"finally\"),[\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(108,108)]),\\char-class([range(121,121)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiY2FzZU9mIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtsaXQoImNhc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p = (IConstructor) _read("prod(label(\"caseOf\",sort(\"CaseClause\")),[lit(\"case\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIl49IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5NCw5NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"^=\"),[\\char-class([range(94,94)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKFxcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU2LDU2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MCw1MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3RhcihcXGNoYXItY2xhc3MoW3JhbmdlKDY1LDkwKSxyYW5nZSg5NywxMjIpXSkpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(65,90),range(97,122)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(65,90),range(97,122)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(65,90),range(97,122)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIml0ZXIoXFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU2LDU2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MCw1MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"iter(\\\\char-class([range(48,57),range(65,70),range(97,102)]))\"),[\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(55,55)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(48,48)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJDb21tZW50XCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Comment\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbc29ydCgiTWV0aG9kRGVmaW5pdGlvbiIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"PropertyAssignment\"),[sort(\"MethodDefinition\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"}\"),[\\char-class([range(125,125)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaW5zdGFuY2VvZiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImluc3RhbmNlb2YiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p = (IConstructor) _read("prod(label(\"instanceof\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"instanceof\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiQ2hhcmFjdGVyRXNjYXBlU2VxdWVuY2UiKV0se30p = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[lex(\"CharacterEscapeSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic291cmNlIixzb3J0KCJTb3VyY2UiKSksW1xpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSldLHt9KQ0000 = (IConstructor) _read("prod(label(\"source\",sort(\"Source\")),[\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIis9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"+=\"),[\\char-class([range(43,43)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImdldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"get\"),[\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibmV3RG90VGFyZ2V0Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ0YXJnZXQiKV0se30p = (IConstructor) _read("prod(label(\"newDotTarget\",sort(\"Expression\")),[lit(\"new\"),layouts(\"LAYOUTLIST\"),lit(\".\"),layouts(\"LAYOUTLIST\"),lit(\"target\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIj09PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p = (IConstructor) _read("prod(lit(\"===\"),[\\char-class([range(61,61)]),\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZG9XaGlsZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImRvIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00 = (IConstructor) _read("prod(label(\"doWhile\",sort(\"Statement\")),[lit(\"do\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHRlbmRzIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"extends\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"NonEscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"NonEscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"NonEscapeCharacter\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiQ29tbWVudFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJDb21tZW50IikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Comment\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Comment\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Comment\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm9wdChsaXQoXCIsXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"opt(lit(\\\",\\\"))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWwiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRGVjaW1hbFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEZWNpbWFsIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Decimal\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Decimal\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Decimal\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"String\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImRvdWJsZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"double\"),[\\char-class([range(100,100)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uXCIpLFtsaXQoXCIsXCIpXSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODYsODYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-seps(sort(\\\"VariableDeclaration\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"shl\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\\<\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionClassChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImJyZWFrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"break\"),[\\char-class([range(98,98)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(107,107)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiU9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzNywzNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"%=\"),[\\char-class([range(37,37)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZXFxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiPT09IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00 = (IConstructor) _read("prod(label(\"eqq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"===\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkbyIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"do\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"(\"),[\\char-class([range(40,40)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibGVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDw9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000 = (IConstructor) _read("prod(label(\"leq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"add\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"+\"),{\\not-follow(\\char-class([range(43,43),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi0tIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"--\"),[\\char-class([range(45,45)]),\\char-class([range(45,45)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZsb2F0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"float\"),[\\char-class([range(102,102)]),\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(97,97)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11XD5cPj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\>\\>\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInZvbGF0aWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTgsMTE4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p = (IConstructor) _read("prod(lit(\"volatile\"),[\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJicmVhayIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"break\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImxvbmciKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"long\"),[\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(103,103)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYnJhY2tldCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIildLHticmFja2V0KCl9KQ0000 = (IConstructor) _read("prod(label(\"bracket\",sort(\"Expression\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\")\")],{bracket()})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJJbml0aWFsaXplciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiSW5pdGlhbGl6ZXIiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Initializer\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Initializer\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Initializer\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidmFyIixzb3J0KCJFeHByZXNzaW9uIikpLFtsZXgoIklkIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"var\",sort(\"Expression\")),[lex(\"Id\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000 = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiY29udGludWVMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImNvbnRpbnVlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"continueLabel\",sort(\"Statement\")),[lit(\"continue\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRhcmdldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"target\"),[\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxpdGVyLXN0YXIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhciIpKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSldLHt9KQ0000 = (IConstructor) _read("prod(lex(\"RegularExpressionClass\"),[\\char-class([range(91,91)]),\\iter-star(lex(\"RegularExpressionClassChar\")),\\char-class([range(93,93)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIj8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYzLDYzKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"?\"),[\\char-class([range(63,63)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmb3IiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"for\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImRvIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"do\"),[\\char-class([range(100,100)]),\\char-class([range(111,111)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNhc2VDbGF1c2VcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"CaseClause\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"CaseClause\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMSFNFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxIU0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxIU0V4cHJlc3Npb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"LHSExpression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"LHSExpression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"LHSExpression\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzZXEoW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkse1xub3QtcHJlY2VkZShcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzZXEoW2NvbmRpdGlvbmFsKFxcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pLHtcXG5vdC1wcmVjZWRlKFxcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KSxjb25kaXRpb25hbChcXGl0ZXItc3RhcihcXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcXG5vdC1mb2xsb3coXFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNlcShbY29uZGl0aW9uYWwoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSx7XG5vdC1wcmVjZWRlKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0pKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])),[\\char-class([range(0,0)]),lit(\"seq([conditional(\\\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\\\not-precede(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\\\not-follow(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZGVsZXRlIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoImRlbGV0ZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"delete\",sort(\"Expression\")),[lit(\"delete\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiSGV4SW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJIZXhJbnRlZ2VyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexInteger\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZ3QiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00 = (IConstructor) _read("prod(label(\"gt\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIlN0YXRlbWVudCIpKSxbc29ydCgiRnVuY3Rpb24iKV0se30p = (IConstructor) _read("prod(label(\"function\",sort(\"Statement\")),[sort(\"Function\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNvbW1lbnRDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIkNvbW1lbnRDaGFyIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CommentChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"CommentChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"CommentChar\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi8qIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"/*\"),[\\char-class([range(47,47)]),\\char-class([range(42,42)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiPSIpLHtcbm90LWZvbGxvdyhzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assign\",sort(\"Expression\")),[conditional(sort(\"Expression\"),{except(\"objectDefinition\")}),layouts(\"LAYOUTLIST\"),conditional(lit(\"=\"),{\\not-follow(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaW5uIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p = (IConstructor) _read("prod(label(\"inn\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNlcShbY29uZGl0aW9uYWwoXFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkse1xcbm90LXByZWNlZGUoXFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxcaXRlci1zdGFyKFxcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSkse1xcbm90LWZvbGxvdyhcXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MCw1MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU2LDU2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MCw1MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MSw1MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MSw1MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Miw1MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTYsNTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Myw1MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NCw1NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0OSw0OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTAsNTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MSw1MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MSw1MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Miw1MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTYsNTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Myw1MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NCw1NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0OSw0OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTAsNTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTI1LDEyNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"seq([conditional(\\\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\\\not-precede(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\\\not-follow(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(123,123)]),\\char-class([range(92,92)]),\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(45,45)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(125,125)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(123,123)]),\\char-class([range(92,92)]),\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(45,45)]),\\char-class([range(102,102)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(125,125)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSxbbGl0KCJ1IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGV4KCJIZXhEaWdpdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIkhleERpZ2l0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKV0se30p = (IConstructor) _read("prod(sort(\"UnicodeEscapeSequence\"),[lit(\"u\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGdW5jdGlvbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiRnVuY3Rpb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Function\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Function\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Function\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduQmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p = (IConstructor) _read("prod(label(\"assignBinOr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"|=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKV0se30p = (IConstructor) _read("prod(label(\"nonInit\",sort(\"VariableDeclarationNoIn\")),[label(\"id\",lex(\"Id\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJib29sZWFuIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"boolean\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWJ1Z2dlciIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"debugger\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwxNjc3NzIxNSldKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3RhcihcXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMTY3NzcyMTUpXSkpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(1,9),range(11,16777215)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(1,9),range(11,16777215)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(1,9),range(11,16777215)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInByaXZhdGUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"private\"),[\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleStringChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"SingleStringChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"SingleStringChar\"))))})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00 = (IConstructor) _read("regular(\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIkJvb2xlYW4iKV0se30p = (IConstructor) _read("prod(sort(\"Literal\"),[sort(\"Boolean\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJVbmljb2RlRXNjYXBlU2VxdWVuY2VcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODUsODUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"UnicodeEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(85,85)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi89IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"/=\"),[\\char-class([range(47,47)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYmxvY2siLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00 = (IConstructor) _read("prod(label(\"block\",sort(\"Statement\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DoubleStringChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"DoubleStringChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"DoubleStringChar\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpXSx7fSk00 = (IConstructor) _read("prod(label(\"nonInit\",sort(\"VariableDeclaration\")),[label(\"id\",lex(\"Id\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgiZ2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p = (IConstructor) _read("prod(sort(\"MethodDefinition\"),[lit(\"get\"),layouts(\"LAYOUTLIST\"),sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDQxKSxyYW5nZSg0MywxNjc3NzIxNSldKV0se30p = (IConstructor) _read("prod(lex(\"CommentChar\"),[\\char-class([range(1,41),range(43,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImJvb2xlYW4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p = (IConstructor) _read("prod(lit(\"boolean\"),[\\char-class([range(98,98)]),\\char-class([range(111,111)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(110,110)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZm9ySW4iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJ2YXIiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"forIn\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"var\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),label(\"obj\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"VariableDeclaration\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p = (IConstructor) _read("prod(lex(\"SingleStringChar\"),[\\char-class([range(92,92)]),lex(\"EscapeSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleStringChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SingleStringChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SingleStringChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Expression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkhleEVzY2FwZVNlcXVlbmNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLGxleCgiSGV4RGlnaXQiKSxsZXgoIkhleERpZ2l0IildLHt9KQ0000 = (IConstructor) _read("prod(lex(\"HexEscapeSequence\"),[\\char-class([range(120,120)]),lex(\"HexDigit\"),lex(\"HexDigit\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Niw4NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"VariableDeclarationNoIn\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhci1zZXBzKHNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyAssignment\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"PropertyAssignment\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJEZWNsYXJhdG9yIiksW2xpdCgidmFyIildLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Declarator\"),[lit(\"var\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImluc3RhbmNlb2YiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p = (IConstructor) _read("prod(lit(\"instanceof\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(111,111)]),\\char-class([range(102,102)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\",\"),[\\char-class([range(44,44)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODIsODIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuYXRpdmUiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"native\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJQYXJhbVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiUGFyYW0iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Param\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Param\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Param\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIl4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk0LDk0KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"^\"),[\\char-class([range(94,94)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRlY2ltYWwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxvcHQobGV4KCJFeHBvbmVudFBhcnQiKSldLHt9KQ0000 = (IConstructor) _read("prod(lex(\"Decimal\"),[\\char-class([range(46,46)]),iter(\\char-class([range(48,57)])),opt(lex(\"ExponentPart\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpression\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgwLDgwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"opt(sort(\\\"ExponentPart\\\"))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImdvdG8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"goto\"),[\\char-class([range(103,103)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(111,111)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInB1YmxpYyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"public\"),[\\char-class([range(112,112)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11XD49IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\>\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzaG9ydCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"short\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIk51bWVyaWMiKV0se3RhZygiY2F0ZWdvcnkiKCJOdW1lcmljIikpfSk00 = (IConstructor) _read("prod(sort(\"Literal\"),[sort(\"Numeric\")],{tag(\"category\"(\"Numeric\"))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZm9yRG9EZWNsYXJhdGlvbnMiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgib3BzIixcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"forDoDeclarations\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Declarator\"),layouts(\"LAYOUTLIST\"),\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"conds\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"ops\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJNZXRob2REZWZpbml0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk1ldGhvZERlZmluaXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk1ldGhvZERlZmluaXRpb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"MethodDefinition\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"MethodDefinition\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"MethodDefinition\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiQXJnRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"ArgExpression\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"ArgExpression\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibHQiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00 = (IConstructor) _read("prod(label(\"lt\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJlSW5jciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIrKyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"preIncr\",sort(\"Expression\")),[lit(\"++\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClassChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"RegularExpressionClassChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"RegularExpressionClassChar\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIisiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"+\"),[\\char-class([range(43,43)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJIZXhFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMywxMTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"HexEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJIZXhJbnRlZ2VyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDcyLDcyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"HexInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwYWNrYWdlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"package\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzZXEoW1xcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSksbGF5b3V0cyhcIkxBWU9VVExJU1RcIiksb3B0KFxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNlcShbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxvcHQoXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKV0pKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))])),[\\char-class([range(0,0)]),lit(\"seq([\\\\char-class([range(61,61)]),layouts(\\\"LAYOUTLIST\\\"),opt(\\\\char-class([range(61,61)]))])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgicGFyYW1ldGVycyIsc29ydCgiUGFyYW1zIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJib2R5IixcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Function\"),[lit(\"function\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"parameters\",sort(\"Params\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"body\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJMaXRlcmFsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc2LDc2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"Literal\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIklkIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIklkXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIklkIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Id\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Id\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Id\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSldLHt9KQ0000 = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[\\char-class([range(48,57)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzgsNzgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDczLDczKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-seps(sort(\\\"VariableDeclarationNoIn\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzMpLHJhbmdlKDM1LDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p = (IConstructor) _read("prod(lex(\"DoubleStringChar\"),[\\char-class([range(1,9),range(11,33),range(35,91),range(93,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJuYW1lIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoInBhcmFtZXRlcnMiLHNvcnQoIlBhcmFtcyIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiYm9keSIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"Function\"),[lit(\"function\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"parameters\",sort(\"Params\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"body\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLGNvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJpbm4iKX0pKV0se30p = (IConstructor) _read("prod(label(\"init\",sort(\"VariableDeclarationNoIn\")),[label(\"id\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"exp\",conditional(sort(\"Expression\"),{except(\"inn\")}))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibGFiZWxlZCIsc29ydCgiU3RhdGVtZW50IikpLFtsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p = (IConstructor) _read("prod(label(\"labeled\",sort(\"Statement\")),[lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiE9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzMywzMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"!=\"),[\\char-class([range(33,33)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDcwLDcwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionFlags\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(70,70)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(103,103)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMSFNFeHByZXNzaW9uIiksW2NvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJhcnJheSIpLGV4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpLGV4Y2VwdCgiYXNzaWduIil9KV0se30p = (IConstructor) _read("prod(sort(\"LHSExpression\"),[conditional(sort(\"Expression\"),{except(\"array\"),except(\"objectDefinition\"),except(\"assign\")})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInJldHVybiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p = (IConstructor) _read("prod(lit(\"return\"),[\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(110,110)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJEZWNsYXJhdG9yXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Declarator\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduQmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignBinXor\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"^=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidHJ5RmluYWxseSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRyeSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"tryFinally\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"finally\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[\\char-class([range(1,9),range(11,46),range(48,90),range(93,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIl0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"]\"),[\\char-class([range(93,93)])],{})", RascalValueFactory.Production);
    
  // Item declarations
	
	
  protected static class String {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlN0cmluZyIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU3RyaW5nIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(24, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(23, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(21, 1, cHJvZChsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,83,116,114,105,110,103,34,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(22, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(20, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(25, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlN0cmluZyIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU3RyaW5nIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzksMzkpXSksXGl0ZXItc3RhcihsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM5LDM5KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode<IConstructor>(31, 2, new int[][]{{39,39}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(28, 0, new int[][]{{39,39}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(30, 1, cmVndWxhcihcaXRlci1zdGFyKGxleCgiU2luZ2xlU3RyaW5nQ2hhciIpKSk00, new NonTerminalStackNode<IConstructor>(29, 0, "SingleStringChar", null, null), false, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzksMzkpXSksXGl0ZXItc3RhcihsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM5LDM5KV0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGl0ZXItc3RhcihsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode<IConstructor>(36, 2, new int[][]{{34,34}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(33, 0, new int[][]{{34,34}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(35, 1, cmVndWxhcihcaXRlci1zdGFyKGxleCgiRG91YmxlU3RyaW5nQ2hhciIpKSk00, new NonTerminalStackNode<IConstructor>(34, 0, "DoubleStringChar", null, null), false, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGl0ZXItc3RhcihsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlN0cmluZyIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU3RyaW5nIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzksMzkpXSksXGl0ZXItc3RhcihsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM5LDM5KV0pXSx7fSk00(builder);
      
        _init_cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGl0ZXItc3RhcihsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pXSx7fSk00(builder);
      
    }
  }
	
  protected static class Decimal {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLG9wdChsZXgoIkV4cG9uZW50UGFydCIpKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new OptionalStackNode<IConstructor>(81, 1, cmVndWxhcihvcHQobGV4KCJFeHBvbmVudFBhcnQiKSkp, new NonTerminalStackNode<IConstructor>(80, 0, "ExponentPart", null, null), null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(79, 0, "DecimalInteger", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLG9wdChsZXgoIkV4cG9uZW50UGFydCIpKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Niw0NildKSxcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksb3B0KGxleCgiRXhwb25lbnRQYXJ0IikpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[4];
      
      tmp[3] = new OptionalStackNode<IConstructor>(88, 3, cmVndWxhcihvcHQobGV4KCJFeHBvbmVudFBhcnQiKSkp, new NonTerminalStackNode<IConstructor>(87, 0, "ExponentPart", null, null), null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(83, 0, "DecimalInteger", null, null);
      tmp[1] = new CharStackNode<IConstructor>(84, 1, new int[][]{{46,46}}, null, null);
      tmp[2] = new ListStackNode<IConstructor>(86, 2, cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(85, 0, new int[][]{{48,57}}, null, null), false, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Niw0NildKSxcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksb3B0KGxleCgiRXhwb25lbnRQYXJ0IikpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWwiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRGVjaW1hbFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEZWNpbWFsIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(91, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(93, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(96, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(92, 1, cHJvZChsaXQoInNvcnQoXCJEZWNpbWFsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,68,101,99,105,109,97,108,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(95, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(94, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWwiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRGVjaW1hbFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEZWNpbWFsIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxvcHQobGV4KCJFeHBvbmVudFBhcnQiKSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(99, 0, new int[][]{{46,46}}, null, null);
      tmp[2] = new OptionalStackNode<IConstructor>(103, 2, cmVndWxhcihvcHQobGV4KCJFeHBvbmVudFBhcnQiKSkp, new NonTerminalStackNode<IConstructor>(102, 0, "ExponentPart", null, null), null, null);
      tmp[1] = new ListStackNode<IConstructor>(101, 1, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(100, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRlY2ltYWwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxvcHQobGV4KCJFeHBvbmVudFBhcnQiKSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLG9wdChsZXgoIkV4cG9uZW50UGFydCIpKV0se30p(builder);
      
        _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Niw0NildKSxcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksb3B0KGxleCgiRXhwb25lbnRQYXJ0IikpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWwiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRGVjaW1hbFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEZWNpbWFsIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxvcHQobGV4KCJFeHBvbmVudFBhcnQiKSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class Function {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGdW5jdGlvbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiRnVuY3Rpb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(210, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(212, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(214, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(213, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(211, 1, cHJvZChsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3MCw3MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,70,117,110,99,116,105,111,110,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(215, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGdW5jdGlvbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiRnVuY3Rpb24iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgicGFyYW1ldGVycyIsc29ydCgiUGFyYW1zIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJib2R5IixcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[0] = new LiteralStackNode<IConstructor>(218, 0, cHJvZChsaXQoImZ1bmN0aW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {102,117,110,99,116,105,111,110}, null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(231, 10, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(229, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(230, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(228, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(222, 4, "Params", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(234, 12, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(220, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(225, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(227, 8, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(221, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(233, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(219, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(224, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(226, 7, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgicGFyYW1ldGVycyIsc29ydCgiUGFyYW1zIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJib2R5IixcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJuYW1lIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoInBhcmFtZXRlcnMiLHNvcnQoIlBhcmFtcyIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiYm9keSIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[13] = new NonTerminalStackNode<IConstructor>(254, 13, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(248, 10, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(236, 0, cHJvZChsaXQoImZ1bmN0aW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {102,117,110,99,116,105,111,110}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(247, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(241, 4, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(252, 12, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(250, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(251, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(255, 14, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(238, 2, "Id", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(243, 6, "Params", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(246, 8, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(240, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(249, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(237, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(242, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(245, 7, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJuYW1lIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoInBhcmFtZXRlcnMiLHNvcnQoIlBhcmFtcyIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiYm9keSIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGdW5jdGlvbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiRnVuY3Rpb24iKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgicGFyYW1ldGVycyIsc29ydCgiUGFyYW1zIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJib2R5IixcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000(builder);
      
        _init_cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJuYW1lIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoInBhcmFtZXRlcnMiLHNvcnQoIlBhcmFtcyIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiYm9keSIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class Expression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiYmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(617, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(621, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(620, 2, cHJvZChsaXQoIl4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk0LDk0KV0pXSx7fSk00, new int[] {94}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(622, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(616, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXD5cPiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKGxlZnQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(509, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(513, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(512, 2, cHJvZChsaXQoIlw11XD4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p, new int[] {62,62}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{62,62}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(514, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(508, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXD5cPiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKGxlZnQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(363, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(361, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(364, 4, "Id", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(362, 2, cHJvZChsaXQoIi4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pXSx7fSk00, new int[] {46}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(360, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidHlwZW9mIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoInR5cGVvZiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(420, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(421, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(419, 0, cHJvZChsaXQoInR5cGVvZiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidHlwZW9mIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoInR5cGVvZiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZXEiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCI9PSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(589, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(585, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(590, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(588, 2, cHJvZChsaXQoIj09IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {61,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(584, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZXEiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCI9PSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduQmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(677, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(679, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(676, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(678, 2, cHJvZChsaXQoIiY9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzOCwzOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {38,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(680, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduQmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgib3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8fCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(644, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(642, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(641, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(645, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(643, 2, cHJvZChsaXQoInx8IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pXSx7fSk00, new int[] {124,124}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgib3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8fCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduU2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(686, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(684, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(683, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(687, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(685, 2, cHJvZChsaXQoIlw11XD49IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {62,62,61}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduU2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicHJlZml4TWluIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIi0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KSxyYW5nZSg2MSw2MSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(435, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(433, 0, cHJvZChsaXQoIi0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pXSx7fSk00, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[1] = new NonTerminalStackNode<IConstructor>(434, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJlZml4TWluIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIi0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KSxyYW5nZSg2MSw2MSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduQmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(690, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(694, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(692, 2, cHJvZChsaXQoIl49IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5NCw5NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {94,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(693, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(691, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduQmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibmVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiIT0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(576, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(580, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(579, 2, cHJvZChsaXQoIiE9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzMywzMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {33,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(581, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(575, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibmVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiIT0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibm90Iixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIiEiKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(451, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(452, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(450, 0, cHJvZChsaXQoIiEiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDMzLDMzKV0pXSx7fSk00, new int[] {33}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibm90Iixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIiEiKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicHJlRGVjciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCItLSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(456, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(457, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(455, 0, cHJvZChsaXQoIi0tIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSldLHt9KQ0000, new int[] {45,45}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJlRGVjciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCItLSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgib2JqZWN0RGVmaW5pdGlvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxvcHQobGl0KCIsIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(313, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(322, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(319, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(318, 2, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiUHJvcGVydHlBc3NpZ25tZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00, new NonTerminalStackNode<IConstructor>(314, 0, "PropertyAssignment", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(315, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(316, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(317, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(323, 6, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(321, 4, cmVndWxhcihvcHQobGl0KCIsIikpKQ0000, new LiteralStackNode<IConstructor>(320, 0, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(312, 0, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgib2JqZWN0RGVmaW5pdGlvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxvcHQobGl0KCIsIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYmluTmVnIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIn4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(415, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(416, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(414, 0, cHJvZChsaXQoIn4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNiwxMjYpXSldLHt9KQ0000, new int[] {126}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYmluTmVnIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIn4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduU2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(665, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(663, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(666, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(664, 2, cHJvZChsaXQoIlw11XD5cPj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {62,62,62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(662, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduU2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicG9zdEluY3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIrKyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(404, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(405, 2, cHJvZChsaXQoIisrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpXSldLHt9KQ0000, new int[] {43,43}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(403, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicG9zdEluY3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIrKyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(520, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(518, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(521, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(519, 2, cHJvZChsaXQoIlw11XD5cPiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p, new int[] {62,62,62}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(517, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkZ1bmN0aW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(326, 0, "Function", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkZ1bmN0aW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkV4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkV4cHJlc3Npb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(289, 1, cHJvZChsaXQoInNvcnQoXCJFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(292, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(291, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(288, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(290, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(293, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkV4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkV4cHJlc3Npb24iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibGl0ZXJhbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiTGl0ZXJhbCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(329, 0, "Literal", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibGl0ZXJhbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiTGl0ZXJhbCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibmVxcSIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiE9PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(594, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(596, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(593, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(595, 2, cHJvZChsaXQoIiE9PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzMsMzMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p, new int[] {33,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(597, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibmVxcSIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiE9PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduU3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(670, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(672, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(669, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(671, 2, cHJvZChsaXQoIi09IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {45,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(673, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduU3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzcsMzcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(471, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(475, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(470, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(474, 2, cHJvZChsaXQoIiUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDM3LDM3KV0pXSx7fSk00, new int[] {37}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{37,37},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(476, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzcsMzcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(480, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(484, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(479, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(483, 2, cHJvZChsaXQoIi8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pXSx7fSk00, new int[] {47}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(485, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(490, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(494, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(489, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(493, 2, cHJvZChsaXQoIi0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pXSx7fSk00, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(495, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(612, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(608, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(607, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(613, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(611, 2, cHJvZChsaXQoIiYiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDM4LDM4KV0pXSx7fSk00, new int[] {38}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{38,38},{61,61}})});
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicHJlZml4UGx1cyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwobGl0KCIrIikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(427, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(426, 0, cHJvZChsaXQoIisiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKV0pXSx7fSk00, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[2] = new NonTerminalStackNode<IConstructor>(428, 2, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJlZml4UGx1cyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwobGl0KCIrIikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidGhpcyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ0aGlzIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(332, 0, cHJvZChsaXQoInRoaXMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidGhpcyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ0aGlzIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibWVtYmVyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(370, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(372, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(368, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(367, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(371, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(369, 2, cHJvZChsaXQoIlsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pXSx7fSk00, new int[] {91}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(373, 6, cHJvZChsaXQoIl0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pXSx7fSk00, new int[] {93}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibWVtYmVyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXJyYXkiLHNvcnQoIkV4cHJlc3Npb24iKSksW2xpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLG9wdChsaXQoIiwiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(342, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(336, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(345, 5, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(335, 0, cHJvZChsaXQoIlsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pXSx7fSk00, new int[] {91}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(344, 4, cmVndWxhcihvcHQobGl0KCIsIikpKQ0000, new LiteralStackNode<IConstructor>(343, 0, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(341, 2, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(337, 0, "ArgExpression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(338, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(339, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(340, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(346, 6, cHJvZChsaXQoIl0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pXSx7fSk00, new int[] {93}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXJyYXkiLHNvcnQoIkV4cHJlc3Npb24iKSksW2xpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLG9wdChsaXQoIiwiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduRGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(699, 2, cHJvZChsaXQoIi89IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {47,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(701, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(697, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(698, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(700, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduRGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduTXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(706, 2, cHJvZChsaXQoIio9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {42,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(708, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(704, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(705, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(707, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduTXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj8iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[6] = new LiteralStackNode<IConstructor>(656, 6, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(651, 2, cHJvZChsaXQoIj8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYzLDYzKV0pXSx7fSk00, new int[] {63}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(654, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(649, 0, "Expression", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(657, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(650, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(655, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(652, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(658, 8, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj8iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduU2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPD0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(713, 2, cHJvZChsaXQoIlw8XDw9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjAsNjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {60,60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(715, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(711, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(712, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(714, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduU2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPD0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(465, 2, cHJvZChsaXQoIioiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQyLDQyKV0pXSx7fSk00, new int[] {42}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{42,42},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(467, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(461, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(462, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(466, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJiYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MobGVmdCgpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(636, 2, cHJvZChsaXQoIiYmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzOCwzOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpXSldLHt9KQ0000, new int[] {38,38}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(638, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(634, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(635, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(637, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJiYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MobGVmdCgpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(299, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(302, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(297, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(298, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIkV4cHJlc3Npb25cIiksW2xpdChcIixcIildKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,69,120,112,114,101,115,115,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(301, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(300, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibmV3Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(392, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(390, 0, cHJvZChsaXQoIm5ldyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKV0se30p, new int[] {110,101,119}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(391, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibmV3Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduUmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(720, 2, cHJvZChsaXQoIiU9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzNywzNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {37,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(722, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(718, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(719, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(721, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduUmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduQWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(727, 2, cHJvZChsaXQoIis9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {43,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(729, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(725, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(726, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(728, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduQWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicG9zdERlYyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi0tIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(410, 2, cHJvZChsaXQoIi0tIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSldLHt9KQ0000, new int[] {45,45}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(408, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(409, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicG9zdERlYyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi0tIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCJ8Iikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSkscmFuZ2UoMTI0LDEyNCldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(631, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(629, 2, cHJvZChsaXQoInwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNCwxMjQpXSldLHt9KQ0000, new int[] {124}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61},{124,124}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(625, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(630, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(626, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCJ8Iikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSkscmFuZ2UoMTI0LDEyNCldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZ2VxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD49IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(536, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(534, 2, cHJvZChsaXQoIlw11PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(532, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(535, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(533, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZ2VxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD49IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiY2FsbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[4] = new SeparatedListStackNode<IConstructor>(384, 4, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(380, 0, "ArgExpression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(381, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(382, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(383, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(386, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(378, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(376, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(379, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(377, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(385, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiY2FsbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaW5zdGFuY2VvZiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImluc3RhbmNlb2YiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(539, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(541, 2, cHJvZChsaXQoImluc3RhbmNlb2YiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(543, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(540, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(542, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaW5zdGFuY2VvZiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImluc3RhbmNlb2YiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibmV3RG90VGFyZ2V0Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ0YXJnZXQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(395, 0, cHJvZChsaXQoIm5ldyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKV0se30p, new int[] {110,101,119}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(397, 2, cHJvZChsaXQoIi4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pXSx7fSk00, new int[] {46}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(399, 4, cHJvZChsaXQoInRhcmdldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSldLHt9KQ0000, new int[] {116,97,114,103,101,116}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(396, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(398, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibmV3RG90VGFyZ2V0Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ0YXJnZXQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZXFxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiPT09IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(600, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(602, 2, cHJvZChsaXQoIj09PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p, new int[] {61,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(604, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(601, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(603, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZXFxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiPT09IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibGVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDw9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(546, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(548, 2, cHJvZChsaXQoIlw8PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjAsNjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(550, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(547, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(549, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibGVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDw9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(524, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(526, 2, cHJvZChsaXQoIlw8XDwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYwLDYwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKV0se30p, new int[] {60,60}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(528, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(525, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(527, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(498, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(502, 2, cHJvZChsaXQoIisiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKV0pXSx7fSk00, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(504, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(499, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(503, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYnJhY2tldCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIildLHticmFja2V0KCl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(349, 0, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(351, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(353, 4, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(350, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(352, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYnJhY2tldCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIildLHticmFja2V0KCl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidmFyIixzb3J0KCJFeHByZXNzaW9uIikpLFtsZXgoIklkIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(356, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidmFyIixzb3J0KCJFeHByZXNzaW9uIikpLFtsZXgoIklkIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZGVsZXRlIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoImRlbGV0ZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(438, 0, cHJvZChsaXQoImRlbGV0ZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {100,101,108,101,116,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(440, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(439, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZGVsZXRlIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoImRlbGV0ZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZ3QiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(553, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(555, 2, cHJvZChsaXQoIlw11IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p, new int[] {62}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(557, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(554, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(556, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZ3QiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiPSIpLHtcbm90LWZvbGxvdyhzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(733, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(743, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(741, 2, cHJvZChsaXQoIj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(742, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(734, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiPSIpLHtcbm90LWZvbGxvdyhzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaW5uIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(560, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(564, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(562, 2, cHJvZChsaXQoImluIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pXSx7fSk00, new int[] {105,110}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(563, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(561, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaW5uIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduQmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(746, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(750, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(748, 2, cHJvZChsaXQoInw9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p, new int[] {124,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(749, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(747, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduQmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibHQiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(567, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(571, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(569, 2, cHJvZChsaXQoIlw8IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKV0se30p, new int[] {60}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(570, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(568, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibHQiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicHJlSW5jciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIrKyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(443, 0, cHJvZChsaXQoIisrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpXSldLHt9KQ0000, new int[] {43,43}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(445, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(444, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJlSW5jciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIrKyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiYmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgic2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXD5cPiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKGxlZnQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgidHlwZW9mIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoInR5cGVvZiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiZXEiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCI9PSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduQmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgib3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8fCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduU2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicHJlZml4TWluIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIi0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KSxyYW5nZSg2MSw2MSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduQmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgibmVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiIT0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgibm90Iixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIiEiKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicHJlRGVjciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCItLSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgib2JqZWN0RGVmaW5pdGlvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxvcHQobGl0KCIsIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiYmluTmVnIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIn4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduU2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicG9zdEluY3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIrKyIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgic2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkZ1bmN0aW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkV4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkV4cHJlc3Npb24iKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgibGl0ZXJhbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiTGl0ZXJhbCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgibmVxcSIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiE9PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduU3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzcsMzcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgic3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgicHJlZml4UGx1cyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwobGl0KCIrIikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgidGhpcyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ0aGlzIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgibWVtYmVyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXJyYXkiLHNvcnQoIkV4cHJlc3Npb24iKSksW2xpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLG9wdChsaXQoIiwiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduRGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduTXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj8iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduU2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPD0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgibXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJiYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MobGVmdCgpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgibmV3Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduUmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduQWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicG9zdERlYyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi0tIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCJ8Iikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSkscmFuZ2UoMTI0LDEyNCldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiZ2VxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD49IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiY2FsbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiaW5zdGFuY2VvZiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImluc3RhbmNlb2YiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgibmV3RG90VGFyZ2V0Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ0YXJnZXQiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiZXFxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiPT09IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgibGVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDw9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgic2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYnJhY2tldCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIildLHticmFja2V0KCl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgidmFyIixzb3J0KCJFeHByZXNzaW9uIikpLFtsZXgoIklkIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiZGVsZXRlIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoImRlbGV0ZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiZ3QiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiPSIpLHtcbm90LWZvbGxvdyhzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiaW5uIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduQmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgibHQiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgicHJlSW5jciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIrKyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
    }
  }
	
  protected static class layouts_$default$ {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYXlvdXRzKCIkZGVmYXVsdCQiKSxbXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode<IConstructor>(820, 0);
      builder.addAlternative(Parser.cHJvZChsYXlvdXRzKCIkZGVmYXVsdCQiKSxbXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYXlvdXRzKCIkZGVmYXVsdCQiKSxbXSx7fSk00(builder);
      
    }
  }
	
  protected static class RegularExpressionFlags {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSxbY29uZGl0aW9uYWwoXGl0ZXItc3RhcihcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKX0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode<IConstructor>(839, 0, cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKSk00, new CharStackNode<IConstructor>(836, 0, new int[][]{{65,90},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{97,122}})});
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSxbY29uZGl0aW9uYWwoXGl0ZXItc3RhcihcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKX0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25GbGFnc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(844, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(847, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(842, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(843, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDcwLDcwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,108,97,103,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(846, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(845, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25GbGFnc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSxbY29uZGl0aW9uYWwoXGl0ZXItc3RhcihcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKX0pXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25GbGFnc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzIikpKX0p(builder);
      
    }
  }
	
  protected static class Source {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTb3VyY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU291cmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTb3VyY2UiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(858, 1, cHJvZChsaXQoInNvcnQoXCJTb3VyY2VcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,83,111,117,114,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(861, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(860, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(859, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(862, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(857, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTb3VyY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU291cmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTb3VyY2UiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic291cmNlIixzb3J0KCJTb3VyY2UiKSksW1xpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(868, 0, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(866, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(867, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic291cmNlIixzb3J0KCJTb3VyY2UiKSksW1xpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTb3VyY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU291cmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTb3VyY2UiKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgic291cmNlIixzb3J0KCJTb3VyY2UiKSksW1xpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class RegularExpressionFirstChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1024, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1023, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1021, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkZpcnN0Q2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3MCw3MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,105,114,115,116,67,104,97,114,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1025, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1022, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1020, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDQxKSxyYW5nZSg0Myw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1028, 0, new int[][]{{1,9},{11,41},{43,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDQxKSxyYW5nZSg0Myw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25DbGFzcyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1030, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25DbGFzcyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1032, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDQxKSxyYW5nZSg0Myw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25DbGFzcyIpXSx7fSk00(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class HexDigit {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleERpZ2l0IikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleERpZ2l0XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleERpZ2l0IikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1140, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1139, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1137, 1, cHJvZChsaXQoInNvcnQoXCJIZXhEaWdpdFwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,72,101,120,68,105,103,105,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1141, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1138, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1136, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleERpZ2l0IikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleERpZ2l0XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleERpZ2l0IikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkhleERpZ2l0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1144, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkhleERpZ2l0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleERpZ2l0IikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleERpZ2l0XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleERpZ2l0IikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkhleERpZ2l0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKV0se30p(builder);
      
    }
  }
	
  protected static class CommentChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pKX0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1710, 0, new int[][]{{42,42}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47}})});
      builder.addAlternative(Parser.cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pKX0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNvbW1lbnRDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNvbW1lbnRDaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(1714, 1, cHJvZChsaXQoInNvcnQoXCJDb21tZW50Q2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1713, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1718, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1717, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1716, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1715, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNvbW1lbnRDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNvbW1lbnRDaGFyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNvbW1lbnRDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIkNvbW1lbnRDaGFyIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1722, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1727, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1723, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJDb21tZW50Q2hhclwiKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1724, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1726, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1725, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNvbW1lbnRDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIkNvbW1lbnRDaGFyIikpKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDQxKSxyYW5nZSg0MywxNjc3NzIxNSldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1731, 0, new int[][]{{1,41},{43,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDQxKSxyYW5nZSg0MywxNjc3NzIxNSldKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pKX0pXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNvbW1lbnRDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNvbW1lbnRDaGFyIikpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNvbW1lbnRDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIkNvbW1lbnRDaGFyIikpKSl9KQ0000(builder);
      
        _init_cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDQxKSxyYW5nZSg0MywxNjc3NzIxNSldKV0se30p(builder);
      
    }
  }
	
  protected static class ForBinding {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGb3JCaW5kaW5nIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkZvckJpbmRpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkZvckJpbmRpbmciKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1801, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1800, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1798, 1, cHJvZChsaXQoInNvcnQoXCJGb3JCaW5kaW5nXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDcwLDcwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Niw2NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,70,111,114,66,105,110,100,105,110,103,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1802, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1799, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1797, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGb3JCaW5kaW5nIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkZvckJpbmRpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkZvckJpbmRpbmciKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJGb3JCaW5kaW5nIiksW2xleCgiSWQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1805, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJGb3JCaW5kaW5nIiksW2xleCgiSWQiKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGb3JCaW5kaW5nIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkZvckJpbmRpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkZvckJpbmRpbmciKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJGb3JCaW5kaW5nIiksW2xleCgiSWQiKV0se30p(builder);
      
    }
  }
	
  protected static class RegularExpression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[4];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(1856, 3, "RegularExpressionFlags", null, null);
      tmp[0] = new CharStackNode<IConstructor>(1853, 0, new int[][]{{47,47}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1854, 1, "RegularExpressionBody", null, null);
      tmp[2] = new CharStackNode<IConstructor>(1855, 2, new int[][]{{47,47}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1859, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1864, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1863, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1862, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1861, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1860, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpKX0p(builder);
      
    }
  }
	
  protected static class UnicodeEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiVW5pY29kZUVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1895, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1894, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1892, 1, cHJvZChsaXQoInNvcnQoXCJVbmljb2RlRXNjYXBlU2VxdWVuY2VcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODUsODUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,85,110,105,99,111,100,101,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1896, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1893, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1891, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiVW5pY29kZUVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSxbbGl0KCJ1IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGV4KCJIZXhEaWdpdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIkhleERpZ2l0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[0] = new LiteralStackNode<IConstructor>(1899, 0, cHJvZChsaXQoInUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSldLHt9KQ0000, new int[] {117}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(1903, 4, "HexDigit", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(1905, 6, "HexDigit", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(1901, 2, "HexDigit", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(1907, 8, "HexDigit", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(1902, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(1906, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(1904, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1900, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSxbbGl0KCJ1IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGV4KCJIZXhEaWdpdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIkhleERpZ2l0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiVW5pY29kZUVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSxbbGl0KCJ1IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGV4KCJIZXhEaWdpdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIkhleERpZ2l0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKV0se30p(builder);
      
    }
  }
	
  protected static class CaseClause {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiZGVmYXVsdENhc2UiLHNvcnQoIkNhc2VDbGF1c2UiKSksW2xpdCgiZGVmYXVsdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(1952, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(1951, 0, cHJvZChsaXQoImRlZmF1bHQiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pXSx7fSk00, new int[] {100,101,102,97,117,108,116}, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(1957, 4, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(1955, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(1956, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(1954, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1953, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZGVmYXVsdENhc2UiLHNvcnQoIkNhc2VDbGF1c2UiKSksW2xpdCgiZGVmYXVsdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNhc2VDbGF1c2VcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkNhc2VDbGF1c2UiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(1962, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1961, 1, cHJvZChsaXQoInNvcnQoXCJDYXNlQ2xhdXNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1964, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1963, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1965, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1960, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNhc2VDbGF1c2VcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkNhc2VDbGF1c2UiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiY2FzZU9mIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtsaXQoImNhc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[6] = new SeparatedListStackNode<IConstructor>(1977, 6, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(1975, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(1976, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(1969, 0, cHJvZChsaXQoImNhc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {99,97,115,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(1971, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(1973, 4, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(1974, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1970, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(1972, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiY2FzZU9mIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtsaXQoImNhc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNhc2VDbGF1c2VcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1980, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1982, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1985, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1981, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJDYXNlQ2xhdXNlXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1984, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1983, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNhc2VDbGF1c2VcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiZGVmYXVsdENhc2UiLHNvcnQoIkNhc2VDbGF1c2UiKSksW2xpdCgiZGVmYXVsdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNhc2VDbGF1c2VcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkNhc2VDbGF1c2UiKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiY2FzZU9mIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtsaXQoImNhc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNhc2VDbGF1c2VcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(builder);
      
    }
  }
	
  protected static class VariableDeclaration {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2071, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2070, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2068, 1, cHJvZChsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2067, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2069, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2072, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXNlcHMoc29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2080, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2079, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2077, 1, cHJvZChsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uXCIpLFtsaXQoXCIsXCIpXSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODYsODYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2076, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2081, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2078, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXNlcHMoc29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImV4cCIsc29ydCgiRXhwcmVzc2lvbiIpKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2092, 2, cHJvZChsaXQoIj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2093, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(2094, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2089, 0, "Id", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2091, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImV4cCIsc29ydCgiRXhwcmVzc2lvbiIpKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2098, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXNlcHMoc29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImV4cCIsc29ydCgiRXhwcmVzc2lvbiIpKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpXSx7fSk00(builder);
      
    }
  }
	
  protected static class RegularExpressionBody {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25Cb2R5IikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2108, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2107, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2105, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODIsODIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjYsNjYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,111,100,121,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2109, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2106, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2104, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25Cb2R5IikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode<IConstructor>(2114, 1, cmVndWxhcihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKQ0000, new NonTerminalStackNode<IConstructor>(2113, 0, "RegularExpressionChar", null, null), false, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2112, 0, "RegularExpressionFirstChar", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25Cb2R5IikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKV0se30p(builder);
      
    }
  }
	
  protected static class Declarator {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJEZWNsYXJhdG9yIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2xhcmF0b3JcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkRlY2xhcmF0b3IiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(2196, 1, cHJvZChsaXQoInNvcnQoXCJEZWNsYXJhdG9yXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,68,101,99,108,97,114,97,116,111,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2199, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2198, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2195, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2197, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2200, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJEZWNsYXJhdG9yIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2xhcmF0b3JcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkRlY2xhcmF0b3IiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJEZWNsYXJhdG9yIiksW2xpdCgidmFyIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(2203, 0, cHJvZChsaXQoInZhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE4LDExOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSldLHt9KQ0000, new int[] {118,97,114}, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJEZWNsYXJhdG9yIiksW2xpdCgidmFyIildLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJEZWNsYXJhdG9yIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2xhcmF0b3JcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkRlY2xhcmF0b3IiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJEZWNsYXJhdG9yIiksW2xpdCgidmFyIildLHt9KQ0000(builder);
      
    }
  }
	
  protected static class VarDecl {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJEZWNsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhckRlY2xcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhckRlY2wiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(2219, 1, cHJvZChsaXQoInNvcnQoXCJWYXJEZWNsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,86,97,114,68,101,99,108,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2222, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2221, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2218, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2220, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2223, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJEZWNsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhckRlY2xcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhckRlY2wiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJWYXJEZWNsIiksW3NvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImRlY2xhcmF0aW9ucyIsXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2227, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2234, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2226, 0, "Declarator", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(2232, 2, cmVndWxhcihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(2228, 0, "VariableDeclaration", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2229, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(2230, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(2231, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2235, 4, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJWYXJEZWNsIiksW3NvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImRlY2xhcmF0aW9ucyIsXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJEZWNsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhckRlY2xcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhckRlY2wiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJWYXJEZWNsIiksW3NvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImRlY2xhcmF0aW9ucyIsXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class DoubleStringChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2285, 1, "EscapeSequence", null, null);
      tmp[0] = new CharStackNode<IConstructor>(2284, 0, new int[][]{{92,92}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2290, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2293, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2288, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2289, 1, cHJvZChsaXQoInNvcnQoXCJEb3VibGVTdHJpbmdDaGFyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2292, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2291, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2297, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2302, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2299, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2301, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2300, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2298, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJEb3VibGVTdHJpbmdDaGFyXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzMpLHJhbmdlKDM1LDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2306, 0, new int[][]{{1,9},{11,33},{35,91},{93,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzMpLHJhbmdlKDM1LDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKSl9KQ0000(builder);
      
        _init_cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzMpLHJhbmdlKDM1LDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p(builder);
      
    }
  }
	
  protected static class Id {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIklkIiksW2NvbmRpdGlvbmFsKHNlcShbY29uZGl0aW9uYWwoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSx7XG5vdC1wcmVjZWRlKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0pLHtkZWxldGUoa2V5d29yZHMoIlJlc2VydmVkIikpfSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SequenceStackNode<IConstructor>(2386, 0, cmVndWxhcihzZXEoW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkse1xub3QtcHJlY2VkZShcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldKSk00, (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new CharStackNode<IConstructor>(2379, 0, new int[][]{{36,36},{65,90},{95,95},{97,122}}, new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null), new ListStackNode<IConstructor>(2383, 1, cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSk00, new CharStackNode<IConstructor>(2380, 0, new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})})}, null, new ICompletionFilter[] {new StringMatchRestriction(new int[] {98,114,101,97,107}), new StringMatchRestriction(new int[] {116,104,105,115}), new StringMatchRestriction(new int[] {105,102}), new StringMatchRestriction(new int[] {110,97,116,105,118,101}), new StringMatchRestriction(new int[] {116,114,97,110,115,105,101,110,116}), new StringMatchRestriction(new int[] {105,110,116}), new StringMatchRestriction(new int[] {116,104,114,111,119,115}), new StringMatchRestriction(new int[] {105,110,115,116,97,110,99,101,111,102}), new StringMatchRestriction(new int[] {110,101,119}), new StringMatchRestriction(new int[] {115,117,112,101,114}), new StringMatchRestriction(new int[] {99,97,116,99,104}), new StringMatchRestriction(new int[] {116,114,121}), new StringMatchRestriction(new int[] {101,120,116,101,110,100,115}), new StringMatchRestriction(new int[] {105,110,116,101,114,102,97,99,101}), new StringMatchRestriction(new int[] {101,108,115,101}), new StringMatchRestriction(new int[] {102,117,110,99,116,105,111,110}), new StringMatchRestriction(new int[] {99,108,97,115,115}), new StringMatchRestriction(new int[] {102,108,111,97,116}), new StringMatchRestriction(new int[] {108,111,110,103}), new StringMatchRestriction(new int[] {118,111,108,97,116,105,108,101}), new StringMatchRestriction(new int[] {115,104,111,114,116}), new StringMatchRestriction(new int[] {119,104,105,108,101}), new StringMatchRestriction(new int[] {100,111,117,98,108,101}), new StringMatchRestriction(new int[] {116,121,112,101,111,102}), new StringMatchRestriction(new int[] {99,97,115,101}), new StringMatchRestriction(new int[] {105,109,112,108,101,109,101,110,116,115}), new StringMatchRestriction(new int[] {114,101,116,117,114,110}), new StringMatchRestriction(new int[] {99,104,97,114}), new StringMatchRestriction(new int[] {102,105,110,97,108}), new StringMatchRestriction(new int[] {115,119,105,116,99,104}), new StringMatchRestriction(new int[] {101,120,112,111,114,116}), new StringMatchRestriction(new int[] {115,121,110,99,104,114,111,110,105,122,101,100}), new StringMatchRestriction(new int[] {118,111,105,100}), new StringMatchRestriction(new int[] {100,101,108,101,116,101}), new StringMatchRestriction(new int[] {100,111}), new StringMatchRestriction(new int[] {112,117,98,108,105,99}), new StringMatchRestriction(new int[] {102,111,114}), new StringMatchRestriction(new int[] {98,121,116,101}), new StringMatchRestriction(new int[] {98,111,111,108,101,97,110}), new StringMatchRestriction(new int[] {112,114,111,116,101,99,116,101,100}), new StringMatchRestriction(new int[] {115,116,97,116,105,99}), new StringMatchRestriction(new int[] {116,114,117,101}), new StringMatchRestriction(new int[] {99,111,110,115,116}), new StringMatchRestriction(new int[] {103,111,116,111}), new StringMatchRestriction(new int[] {102,97,108,115,101}), new StringMatchRestriction(new int[] {102,105,110,97,108,108,121}), new StringMatchRestriction(new int[] {112,114,105,118,97,116,101}), new StringMatchRestriction(new int[] {100,101,102,97,117,108,116}), new StringMatchRestriction(new int[] {101,110,117,109}), new StringMatchRestriction(new int[] {100,101,98,117,103,103,101,114}), new StringMatchRestriction(new int[] {118,97,114}), new StringMatchRestriction(new int[] {110,117,108,108}), new StringMatchRestriction(new int[] {99,111,110,116,105,110,117,101}), new StringMatchRestriction(new int[] {116,104,114,111,119}), new StringMatchRestriction(new int[] {112,97,99,107,97,103,101}), new StringMatchRestriction(new int[] {105,109,112,111,114,116}), new StringMatchRestriction(new int[] {105,110})});
      builder.addAlternative(Parser.cHJvZChsZXgoIklkIiksW2NvbmRpdGlvbmFsKHNlcShbY29uZGl0aW9uYWwoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSx7XG5vdC1wcmVjZWRlKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0pLHtkZWxldGUoa2V5d29yZHMoIlJlc2VydmVkIikpfSldLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIklkIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIklkXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIklkIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2389, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2394, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2391, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2393, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2392, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2390, 1, cHJvZChsaXQoInNvcnQoXCJJZFwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,73,100,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIklkIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIklkXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIklkIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIklkIiksW2NvbmRpdGlvbmFsKHNlcShbY29uZGl0aW9uYWwoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSx7XG5vdC1wcmVjZWRlKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0pLHtkZWxldGUoa2V5d29yZHMoIlJlc2VydmVkIikpfSldLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIklkIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIklkXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIklkIikpKX0p(builder);
      
    }
  }
	
  protected static class NonEscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwzMykscmFuZ2UoMzUsMzgpLHJhbmdlKDQwLDQ3KSxyYW5nZSg1OCw5MSkscmFuZ2UoOTMsOTcpLHJhbmdlKDk5LDEwMSkscmFuZ2UoMTAzLDEwOSkscmFuZ2UoMTExLDExMykscmFuZ2UoMTE1LDExNSkscmFuZ2UoMTE5LDExOSkscmFuZ2UoMTIxLDE2Nzc3MjE1KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2399, 0, new int[][]{{1,9},{11,33},{35,38},{40,47},{58,91},{93,97},{99,101},{103,109},{111,113},{115,115},{119,119},{121,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwzMykscmFuZ2UoMzUsMzgpLHJhbmdlKDQwLDQ3KSxyYW5nZSg1OCw5MSkscmFuZ2UoOTMsOTcpLHJhbmdlKDk5LDEwMSkscmFuZ2UoMTAzLDEwOSkscmFuZ2UoMTExLDExMykscmFuZ2UoMTE1LDExNSkscmFuZ2UoMTE5LDExOSkscmFuZ2UoMTIxLDE2Nzc3MjE1KV0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2402, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2404, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2407, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2403, 1, cHJvZChsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzgsNzgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,78,111,110,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2406, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2405, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwzMykscmFuZ2UoMzUsMzgpLHJhbmdlKDQwLDQ3KSxyYW5nZSg1OCw5MSkscmFuZ2UoOTMsOTcpLHJhbmdlKDk5LDEwMSkscmFuZ2UoMTAzLDEwOSkscmFuZ2UoMTExLDExMykscmFuZ2UoMTE1LDExNSkscmFuZ2UoMTE5LDExOSkscmFuZ2UoMTIxLDE2Nzc3MjE1KV0pXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIikpKX0p(builder);
      
    }
  }
	
  protected static class RegularExpressionClassChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2420, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDkxKSxyYW5nZSg5NCwxNjc3NzIxNSldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2422, 0, new int[][]{{1,9},{11,91},{94,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDkxKSxyYW5nZSg5NCwxNjc3NzIxNSldKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2427, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2430, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2425, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2426, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2429, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2428, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2434, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2439, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2436, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2435, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhclwiKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2438, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2437, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKSl9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDkxKSxyYW5nZSg5NCwxNjc3NzIxNSldKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKSl9KQ0000(builder);
      
    }
  }
	
  protected static class Whitespace {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIldoaXRlc3BhY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDksMTApLHJhbmdlKDEzLDEzKSxyYW5nZSgzMiwzMildKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2563, 0, new int[][]{{9,10},{13,13},{32,32}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIldoaXRlc3BhY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDksMTApLHJhbmdlKDEzLDEzKSxyYW5nZSgzMiwzMildKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIldoaXRlc3BhY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiV2hpdGVzcGFjZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJXaGl0ZXNwYWNlIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(2571, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2568, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2566, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2570, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2569, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2567, 1, cHJvZChsaXQoInNvcnQoXCJXaGl0ZXNwYWNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg3LDg3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,87,104,105,116,101,115,112,97,99,101,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIldoaXRlc3BhY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiV2hpdGVzcGFjZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJXaGl0ZXNwYWNlIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIldoaXRlc3BhY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDksMTApLHJhbmdlKDEzLDEzKSxyYW5nZSgzMiwzMildKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIldoaXRlc3BhY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiV2hpdGVzcGFjZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJXaGl0ZXNwYWNlIikpKX0p(builder);
      
    }
  }
	
  protected static class HexEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleEVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2615, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2614, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2612, 1, cHJvZChsaXQoInNvcnQoXCJIZXhFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMywxMTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,72,101,120,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2616, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2613, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2611, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleEVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkhleEVzY2FwZVNlcXVlbmNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLGxleCgiSGV4RGlnaXQiKSxsZXgoIkhleERpZ2l0IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(2619, 0, new int[][]{{120,120}}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2621, 2, "HexDigit", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2620, 1, "HexDigit", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkhleEVzY2FwZVNlcXVlbmNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLGxleCgiSGV4RGlnaXQiKSxsZXgoIkhleERpZ2l0IildLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleEVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkhleEVzY2FwZVNlcXVlbmNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLGxleCgiSGV4RGlnaXQiKSxsZXgoIkhleERpZ2l0IildLHt9KQ0000(builder);
      
    }
  }
	
  protected static class MethodDefinition {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgic2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiUGFyYW0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[12] = new SeparatedListStackNode<IConstructor>(2838, 12, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(2836, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2837, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2828, 4, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(2830, 6, "Param", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2826, 2, "PropertyName", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(2833, 9, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(2831, 7, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(2839, 13, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(2832, 8, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(2840, 14, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(2834, 10, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2824, 0, cHJvZChsaXQoInNldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {115,101,116}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2827, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(2835, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2825, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2829, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgic2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiUGFyYW0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgiZ2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[9] = new NonTerminalStackNode<IConstructor>(2851, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2846, 4, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2844, 2, "PropertyName", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(2850, 8, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(2849, 7, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2842, 0, cHJvZChsaXQoImdldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {103,101,116}, null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(2854, 10, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(2852, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2853, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(2856, 12, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(2848, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2845, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(2855, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2843, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2847, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgiZ2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJNZXRob2REZWZpbml0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk1ldGhvZERlZmluaXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk1ldGhvZERlZmluaXRpb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2863, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2862, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2860, 1, cHJvZChsaXQoInNvcnQoXCJNZXRob2REZWZpbml0aW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc3LDc3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,77,101,116,104,111,100,68,101,102,105,110,105,116,105,111,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2859, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2864, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2861, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJNZXRob2REZWZpbml0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk1ldGhvZERlZmluaXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk1ldGhvZERlZmluaXRpb24iKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgic2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiUGFyYW0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(builder);
      
        _init_cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgiZ2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJNZXRob2REZWZpbml0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk1ldGhvZERlZmluaXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk1ldGhvZERlZmluaXRpb24iKSkpfSk00(builder);
      
    }
  }
	
  protected static class layouts_LAYOUTLIST {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYXlvdXRzKCJMQVlPVVRMSVNUIiksW2NvbmRpdGlvbmFsKFxpdGVyLXN0YXIobGV4KCJMQVlPVVQiKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg5LDEwKSxyYW5nZSgzMiwzMildKSksXG5vdC1mb2xsb3cobGl0KCIvLyIpKSxcbm90LWZvbGxvdyhsaXQoIi8qIikpfSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode<IConstructor>(2913, 0, cmVndWxhcihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKQ0000, new NonTerminalStackNode<IConstructor>(2908, 0, "LAYOUT", null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{9,10},{32,32}}), new StringFollowRestriction(new int[] {47,47}), new StringFollowRestriction(new int[] {47,42})});
      builder.addAlternative(Parser.cHJvZChsYXlvdXRzKCJMQVlPVVRMSVNUIiksW2NvbmRpdGlvbmFsKFxpdGVyLXN0YXIobGV4KCJMQVlPVVQiKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg5LDEwKSxyYW5nZSgzMiwzMildKSksXG5vdC1mb2xsb3cobGl0KCIvLyIpKSxcbm90LWZvbGxvdyhsaXQoIi8qIikpfSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYXlvdXRzKCJMQVlPVVRMSVNUIiksW2NvbmRpdGlvbmFsKFxpdGVyLXN0YXIobGV4KCJMQVlPVVQiKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg5LDEwKSxyYW5nZSgzMiwzMildKSksXG5vdC1mb2xsb3cobGl0KCIvLyIpKSxcbm90LWZvbGxvdyhsaXQoIi8qIikpfSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class Comment {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvLyIpLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMTY3NzcyMTUpXSkpLHtcZW5kLW9mLWxpbmUoKX0pXSx7dGFnKCJjYXRlZ29yeSIoIkNvbW1lbnQiKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode<IConstructor>(2960, 1, cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pKSk00, new CharStackNode<IConstructor>(2958, 0, new int[][]{{1,9},{11,16777215}}, null, null), false, null, new ICompletionFilter[] {new AtEndOfLineRequirement()});
      tmp[0] = new LiteralStackNode<IConstructor>(2957, 0, cHJvZChsaXQoIi8vIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpXSldLHt9KQ0000, new int[] {47,47}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvLyIpLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMTY3NzcyMTUpXSkpLHtcZW5kLW9mLWxpbmUoKX0pXSx7dGFnKCJjYXRlZ29yeSIoIkNvbW1lbnQiKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvKiIpLFxpdGVyLXN0YXIobGV4KCJDb21tZW50Q2hhciIpKSxsaXQoIiovIildLHt0YWcoImNhdGVnb3J5IigiQ29tbWVudCIpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2965, 2, cHJvZChsaXQoIiovIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpXSldLHt9KQ0000, new int[] {42,47}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(2964, 1, cmVndWxhcihcaXRlci1zdGFyKGxleCgiQ29tbWVudENoYXIiKSkp, new NonTerminalStackNode<IConstructor>(2963, 0, "CommentChar", null, null), false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2962, 0, cHJvZChsaXQoIi8qIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpXSldLHt9KQ0000, new int[] {47,42}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvKiIpLFxpdGVyLXN0YXIobGV4KCJDb21tZW50Q2hhciIpKSxsaXQoIiovIildLHt0YWcoImNhdGVnb3J5IigiQ29tbWVudCIpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiQ29tbWVudFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJDb21tZW50IikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2968, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2970, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2969, 1, cHJvZChsaXQoInNvcnQoXCJDb21tZW50XCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2972, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2971, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2973, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiQ29tbWVudFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJDb21tZW50IikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvLyIpLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMTY3NzcyMTUpXSkpLHtcZW5kLW9mLWxpbmUoKX0pXSx7dGFnKCJjYXRlZ29yeSIoIkNvbW1lbnQiKSl9KQ0000(builder);
      
        _init_cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvKiIpLFxpdGVyLXN0YXIobGV4KCJDb21tZW50Q2hhciIpKSxsaXQoIiovIildLHt0YWcoImNhdGVnb3J5IigiQ29tbWVudCIpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiQ29tbWVudFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJDb21tZW50IikpKX0p(builder);
      
    }
  }
	
  protected static class Reserved {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3290, 0, cHJvZChsaXQoImludCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {105,110,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjaGFyIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3292, 0, cHJvZChsaXQoImNoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {99,104,97,114}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjaGFyIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXRjaCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3294, 0, cHJvZChsaXQoImNhdGNoIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pXSx7fSk00, new int[] {99,97,116,99,104}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXRjaCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb250aW51ZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3296, 0, cHJvZChsaXQoImNvbnRpbnVlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {99,111,110,116,105,110,117,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb250aW51ZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJicmVhayIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3298, 0, cHJvZChsaXQoImJyZWFrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSldLHt9KQ0000, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJicmVhayIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmb3IiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3300, 0, cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {102,111,114}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmb3IiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuYXRpdmUiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3302, 0, cHJvZChsaXQoIm5hdGl2ZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {110,97,116,105,118,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuYXRpdmUiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzaG9ydCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3304, 0, cHJvZChsaXQoInNob3J0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pXSx7fSk00, new int[] {115,104,111,114,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzaG9ydCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwYWNrYWdlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3306, 0, cHJvZChsaXQoInBhY2thZ2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA3LDEwNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {112,97,99,107,97,103,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwYWNrYWdlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHBvcnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3308, 0, cHJvZChsaXQoImV4cG9ydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {101,120,112,111,114,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHBvcnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcm90ZWN0ZWQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3310, 0, cHJvZChsaXQoInByb3RlY3RlZCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000, new int[] {112,114,111,116,101,99,116,101,100}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcm90ZWN0ZWQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBvcnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3312, 0, cHJvZChsaXQoImltcG9ydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {105,109,112,111,114,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBvcnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBsZW1lbnRzIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3314, 0, cHJvZChsaXQoImltcGxlbWVudHMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000, new int[] {105,109,112,108,101,109,101,110,116,115}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBsZW1lbnRzIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmdW5jdGlvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3316, 0, cHJvZChsaXQoImZ1bmN0aW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {102,117,110,99,116,105,111,110}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmdW5jdGlvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkb3VibGUiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3318, 0, cHJvZChsaXQoImRvdWJsZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {100,111,117,98,108,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkb3VibGUiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzd2l0Y2giKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3320, 0, cHJvZChsaXQoInN3aXRjaCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzd2l0Y2giKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXNlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3322, 0, cHJvZChsaXQoImNhc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {99,97,115,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXNlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2YXIiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3324, 0, cHJvZChsaXQoInZhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE4LDExOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSldLHt9KQ0000, new int[] {118,97,114}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2YXIiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aGlsZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3326, 0, cHJvZChsaXQoIndoaWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {119,104,105,108,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aGlsZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb25zdCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3328, 0, cHJvZChsaXQoImNvbnN0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {99,111,110,115,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb25zdCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdXBlciIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3330, 0, cHJvZChsaXQoInN1cGVyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pXSx7fSk00, new int[] {115,117,112,101,114}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdXBlciIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cmFuc2llbnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3332, 0, cHJvZChsaXQoInRyYW5zaWVudCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSldLHt9KQ0000, new int[] {116,114,97,110,115,105,101,110,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cmFuc2llbnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0eXBlb2YiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3334, 0, cHJvZChsaXQoInR5cGVvZiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0eXBlb2YiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aGlzIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3336, 0, cHJvZChsaXQoInRoaXMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aGlzIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvdyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3338, 0, cHJvZChsaXQoInRocm93IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pXSx7fSk00, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvdyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aXRoIiksbGl0KCJhYnN0cmFjdCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3341, 1, cHJvZChsaXQoImFic3RyYWN0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {97,98,115,116,114,97,99,116}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3340, 0, cHJvZChsaXQoIndpdGgiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExOSwxMTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000, new int[] {119,105,116,104}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aXRoIiksbGl0KCJhYnN0cmFjdCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwdWJsaWMiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3343, 0, cHJvZChsaXQoInB1YmxpYyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pXSx7fSk00, new int[] {112,117,98,108,105,99}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwdWJsaWMiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJsb25nIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3345, 0, cHJvZChsaXQoImxvbmciKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSldLHt9KQ0000, new int[] {108,111,110,103}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJsb25nIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdGF0aWMiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3347, 0, cHJvZChsaXQoInN0YXRpYyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pXSx7fSk00, new int[] {115,116,97,116,105,99}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdGF0aWMiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmbG9hdCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3349, 0, cHJvZChsaXQoImZsb2F0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {102,108,111,97,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmbG9hdCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvd3MiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3351, 0, cHJvZChsaXQoInRocm93cyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKV0se30p, new int[] {116,104,114,111,119,115}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvd3MiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWZhdWx0IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3353, 0, cHJvZChsaXQoImRlZmF1bHQiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pXSx7fSk00, new int[] {100,101,102,97,117,108,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWZhdWx0IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuZXciKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3355, 0, cHJvZChsaXQoIm5ldyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKV0se30p, new int[] {110,101,119}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuZXciKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWxldGUiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3357, 0, cHJvZChsaXQoImRlbGV0ZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {100,101,108,101,116,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWxldGUiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnkiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3359, 0, cHJvZChsaXQoInRyeSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKV0se30p, new int[] {116,114,121}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnkiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcml2YXRlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3361, 0, cHJvZChsaXQoInByaXZhdGUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {112,114,105,118,97,116,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcml2YXRlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnVlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3363, 0, cHJvZChsaXQoInRydWUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnVlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2xhdGlsZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3365, 0, cHJvZChsaXQoInZvbGF0aWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTgsMTE4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {118,111,108,97,116,105,108,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2xhdGlsZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJudWxsIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3367, 0, cHJvZChsaXQoIm51bGwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSldLHt9KQ0000, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJudWxsIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbGx5IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3369, 0, cHJvZChsaXQoImZpbmFsbHkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pXSx7fSk00, new int[] {102,105,110,97,108,108,121}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbGx5IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2lkIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3371, 0, cHJvZChsaXQoInZvaWQiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000, new int[] {118,111,105,100}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2lkIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJyZXR1cm4iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3373, 0, cHJvZChsaXQoInJldHVybiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJyZXR1cm4iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmYWxzZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3375, 0, cHJvZChsaXQoImZhbHNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {102,97,108,115,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmYWxzZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnRlcmZhY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3377, 0, cHJvZChsaXQoImludGVyZmFjZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {105,110,116,101,114,102,97,99,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnRlcmZhY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnN0YW5jZW9mIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3379, 0, cHJvZChsaXQoImluc3RhbmNlb2YiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnN0YW5jZW9mIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbHNlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3381, 0, cHJvZChsaXQoImVsc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {101,108,115,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbHNlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3383, 0, cHJvZChsaXQoImluIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pXSx7fSk00, new int[] {105,110}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzeW5jaHJvbml6ZWQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3385, 0, cHJvZChsaXQoInN5bmNocm9uaXplZCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMiwxMjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000, new int[] {115,121,110,99,104,114,111,110,105,122,101,100}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzeW5jaHJvbml6ZWQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpZiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3387, 0, cHJvZChsaXQoImlmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pXSx7fSk00, new int[] {105,102}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpZiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbnVtIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3389, 0, cHJvZChsaXQoImVudW0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSldLHt9KQ0000, new int[] {101,110,117,109}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbnVtIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJieXRlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3391, 0, cHJvZChsaXQoImJ5dGUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {98,121,116,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJieXRlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjbGFzcyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3393, 0, cHJvZChsaXQoImNsYXNzIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000, new int[] {99,108,97,115,115}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjbGFzcyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJnb3RvIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3395, 0, cHJvZChsaXQoImdvdG8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSldLHt9KQ0000, new int[] {103,111,116,111}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJnb3RvIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3397, 0, cHJvZChsaXQoImZpbmFsIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKV0se30p, new int[] {102,105,110,97,108}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHRlbmRzIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3399, 0, cHJvZChsaXQoImV4dGVuZHMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000, new int[] {101,120,116,101,110,100,115}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHRlbmRzIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkbyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3401, 0, cHJvZChsaXQoImRvIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pXSx7fSk00, new int[] {100,111}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkbyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJib29sZWFuIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3403, 0, cHJvZChsaXQoImJvb2xlYW4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {98,111,111,108,101,97,110}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJib29sZWFuIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWJ1Z2dlciIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3405, 0, cHJvZChsaXQoImRlYnVnZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {100,101,98,117,103,103,101,114}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWJ1Z2dlciIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjaGFyIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXRjaCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb250aW51ZSIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJicmVhayIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmb3IiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuYXRpdmUiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzaG9ydCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwYWNrYWdlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHBvcnQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcm90ZWN0ZWQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBvcnQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBsZW1lbnRzIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmdW5jdGlvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkb3VibGUiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzd2l0Y2giKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXNlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2YXIiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aGlsZSIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb25zdCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdXBlciIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cmFuc2llbnQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0eXBlb2YiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aGlzIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvdyIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aXRoIiksbGl0KCJhYnN0cmFjdCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwdWJsaWMiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJsb25nIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdGF0aWMiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmbG9hdCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvd3MiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWZhdWx0IildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuZXciKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWxldGUiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnkiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcml2YXRlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnVlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2xhdGlsZSIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJudWxsIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbGx5IildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2lkIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJyZXR1cm4iKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmYWxzZSIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnRlcmZhY2UiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnN0YW5jZW9mIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbHNlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbiIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzeW5jaHJvbml6ZWQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpZiIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbnVtIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJieXRlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjbGFzcyIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJnb3RvIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHRlbmRzIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkbyIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJib29sZWFuIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWJ1Z2dlciIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class Boolean {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJCb29sZWFuIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkJvb2xlYW5cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkJvb2xlYW4iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3477, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3476, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3474, 1, cHJvZChsaXQoInNvcnQoXCJCb29sZWFuXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY2LDY2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,66,111,111,108,101,97,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3473, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3478, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3475, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJCb29sZWFuIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkJvb2xlYW5cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkJvb2xlYW4iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgidHJ1ZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3481, 0, cHJvZChsaXQoInRydWUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgidHJ1ZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgiZmFsc2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3483, 0, cHJvZChsaXQoImZhbHNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {102,97,108,115,101}, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgiZmFsc2UiKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJCb29sZWFuIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkJvb2xlYW5cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkJvb2xlYW4iKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgidHJ1ZSIpXSx7fSk00(builder);
      
        _init_cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgiZmFsc2UiKV0se30p(builder);
      
    }
  }
	
  protected static class SingleEscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpLHJhbmdlKDM5LDM5KSxyYW5nZSg5Miw5MikscmFuZ2UoOTgsOTgpLHJhbmdlKDEwMiwxMDIpLHJhbmdlKDExMCwxMTApLHJhbmdlKDExNCwxMTQpLHJhbmdlKDExNiwxMTYpLHJhbmdlKDExOCwxMTgpXSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(3487, 0, new int[][]{{34,34},{39,39},{92,92},{98,98},{102,102},{110,110},{114,114},{116,116},{118,118}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpLHJhbmdlKDM5LDM5KSxyYW5nZSg5Miw5MikscmFuZ2UoOTgsOTgpLHJhbmdlKDEwMiwxMDIpLHJhbmdlKDExMCwxMTApLHJhbmdlKDExNCwxMTQpLHJhbmdlKDExNiwxMTYpLHJhbmdlKDExOCwxMTgpXSldLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3492, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3495, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3490, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3491, 1, cHJvZChsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3494, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3493, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpLHJhbmdlKDM5LDM5KSxyYW5nZSg5Miw5MikscmFuZ2UoOTgsOTgpLHJhbmdlKDEwMiwxMDIpLHJhbmdlKDExMCwxMTApLHJhbmdlKDExNCwxMTQpLHJhbmdlKDExNiwxMTYpLHJhbmdlKDExOCwxMTgpXSldLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIikpKX0p(builder);
      
    }
  }
	
  protected static class HexInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkhleEludGVnZXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OCw4OCkscmFuZ2UoMTIwLDEyMCldKSxjb25kaXRpb25hbChpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new CharStackNode<IConstructor>(3532, 1, new int[][]{{88,88},{120,120}}, null, null);
      tmp[2] = new ListStackNode<IConstructor>(3536, 2, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkp, new CharStackNode<IConstructor>(3533, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{95,95},{97,122}})});
      tmp[0] = new CharStackNode<IConstructor>(3531, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkhleEludGVnZXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OCw4OCkscmFuZ2UoMTIwLDEyMCldKSxjb25kaXRpb25hbChpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiSGV4SW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJIZXhJbnRlZ2VyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(3539, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3541, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3544, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3540, 1, cHJvZChsaXQoInNvcnQoXCJIZXhJbnRlZ2VyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDcyLDcyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,72,101,120,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3543, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3542, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiSGV4SW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJIZXhJbnRlZ2VyIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkhleEludGVnZXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OCw4OCkscmFuZ2UoMTIwLDEyMCldKSxjb25kaXRpb25hbChpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiSGV4SW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJIZXhJbnRlZ2VyIikpKX0p(builder);
      
    }
  }
	
  protected static class RegularExpressionBackslashSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3590, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3593, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3588, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3589, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY2LDY2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,97,99,107,115,108,97,115,104,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3592, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3591, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(3596, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new CharStackNode<IConstructor>(3597, 1, new int[][]{{1,9},{11,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pXSx7fSk00(builder);
      
    }
  }
	
  protected static class EscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(3697, 0, new int[][]{{48,48}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW3NvcnQoIlVuaWNvZGVFc2NhcGVTZXF1ZW5jZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3699, 0, "UnicodeEscapeSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW3NvcnQoIlVuaWNvZGVFc2NhcGVTZXF1ZW5jZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkVzY2FwZVNlcXVlbmNlIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3703, 1, cHJvZChsaXQoInNvcnQoXCJFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3706, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3705, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3704, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3707, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3702, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkVzY2FwZVNlcXVlbmNlIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiSGV4RXNjYXBlU2VxdWVuY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3710, 0, "HexEscapeSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiSGV4RXNjYXBlU2VxdWVuY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiQ2hhcmFjdGVyRXNjYXBlU2VxdWVuY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3712, 0, "CharacterEscapeSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiQ2hhcmFjdGVyRXNjYXBlU2VxdWVuY2UiKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00(builder);
      
        _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW3NvcnQoIlVuaWNvZGVFc2NhcGVTZXF1ZW5jZSIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkVzY2FwZVNlcXVlbmNlIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiSGV4RXNjYXBlU2VxdWVuY2UiKV0se30p(builder);
      
        _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiQ2hhcmFjdGVyRXNjYXBlU2VxdWVuY2UiKV0se30p(builder);
      
    }
  }
	
  protected static class ExponentPart {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXhwb25lbnRQYXJ0IikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3721, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3720, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3718, 1, cHJvZChsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgwLDgwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3722, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3719, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3717, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXhwb25lbnRQYXJ0IikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkV4cG9uZW50UGFydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpLHJhbmdlKDEwMSwxMDEpXSksbGV4KCJTaWduZWRJbnRlZ2VyIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(3726, 1, "SignedInteger", null, null);
      tmp[0] = new CharStackNode<IConstructor>(3725, 0, new int[][]{{69,69},{101,101}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkV4cG9uZW50UGFydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpLHJhbmdlKDEwMSwxMDEpXSksbGV4KCJTaWduZWRJbnRlZ2VyIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIob3B0KGxleCgiRXhwb25lbnRQYXJ0IikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3733, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3732, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3730, 1, cHJvZChsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgwLDgwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {111,112,116,40,115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3729, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3734, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3731, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIob3B0KGxleCgiRXhwb25lbnRQYXJ0IikpKSl9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXhwb25lbnRQYXJ0IikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkV4cG9uZW50UGFydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpLHJhbmdlKDEwMSwxMDEpXSksbGV4KCJTaWduZWRJbnRlZ2VyIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIob3B0KGxleCgiRXhwb25lbnRQYXJ0IikpKSl9KQ0000(builder);
      
    }
  }
	
  protected static class SignedInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpZ25lZEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2lnbmVkSW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaWduZWRJbnRlZ2VyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3798, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3797, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3795, 1, cHJvZChsaXQoInNvcnQoXCJTaWduZWRJbnRlZ2VyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,83,105,103,110,101,100,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3794, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3799, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3796, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpZ25lZEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2lnbmVkSW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaWduZWRJbnRlZ2VyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlNpZ25lZEludGVnZXIiKSxbb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNDUsNDUpXSkpLGNvbmRpdGlvbmFsKGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new OptionalStackNode<IConstructor>(3803, 0, cmVndWxhcihvcHQoXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKSxyYW5nZSg0NSw0NSldKSkp, new CharStackNode<IConstructor>(3802, 0, new int[][]{{43,43},{45,45}}, null, null), null, null);
      tmp[1] = new ListStackNode<IConstructor>(3807, 1, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3804, 0, new int[][]{{48,57}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.cHJvZChsZXgoIlNpZ25lZEludGVnZXIiKSxbb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNDUsNDUpXSkpLGNvbmRpdGlvbmFsKGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpZ25lZEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2lnbmVkSW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaWduZWRJbnRlZ2VyIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlNpZ25lZEludGVnZXIiKSxbb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNDUsNDUpXSkpLGNvbmRpdGlvbmFsKGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00(builder);
      
    }
  }
	
  protected static class Numeric {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiSGV4SW50ZWdlciIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3832, 0, "HexInteger", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiSGV4SW50ZWdlciIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJOdW1lcmljIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk51bWVyaWNcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk51bWVyaWMiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3839, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3838, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3835, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3840, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3837, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3836, 1, cHJvZChsaXQoInNvcnQoXCJOdW1lcmljXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,78,117,109,101,114,105,99,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJOdW1lcmljIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk51bWVyaWNcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk51bWVyaWMiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiRGVjaW1hbCIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3845, 0, "Decimal", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiRGVjaW1hbCIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiSGV4SW50ZWdlciIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJOdW1lcmljIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk51bWVyaWNcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk51bWVyaWMiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiRGVjaW1hbCIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class start__Source {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzdGFydChzb3J0KCJTb3VyY2UiKSksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgidG9wIixzb3J0KCJTb3VyY2UiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(3855, 2, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(3852, 0, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(3853, 1, "Source", null, null);
      builder.addAlternative(Parser.cHJvZChzdGFydChzb3J0KCJTb3VyY2UiKSksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgidG9wIixzb3J0KCJTb3VyY2UiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzdGFydChzb3J0KCJTb3VyY2UiKSksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgidG9wIixzb3J0KCJTb3VyY2UiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class Param {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJQYXJhbSIpLFtsZXgoIklkIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3859, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQYXJhbSIpLFtsZXgoIklkIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQYXJhbSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3863, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4MCw4MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,80,97,114,97,109,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3867, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3864, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3866, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3865, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3862, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQYXJhbSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJQYXJhbVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiUGFyYW0iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(3880, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3877, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3876, 1, cHJvZChsaXQoInNvcnQoXCJQYXJhbVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4MCw4MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,80,97,114,97,109,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3875, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3879, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3878, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJQYXJhbVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiUGFyYW0iKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJQYXJhbSIpLFtsZXgoIklkIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQYXJhbSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJQYXJhbVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiUGFyYW0iKSkpfSk00(builder);
      
    }
  }
	
  protected static class RegularExpressionClass {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25DbGFzc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(4010, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4013, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4008, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4009, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4012, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4011, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25DbGFzc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxpdGVyLXN0YXIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhciIpKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(4016, 0, new int[][]{{91,91}}, null, null);
      tmp[2] = new CharStackNode<IConstructor>(4019, 2, new int[][]{{93,93}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(4018, 1, cmVndWxhcihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DbGFzc0NoYXIiKSkp, new NonTerminalStackNode<IConstructor>(4017, 0, "RegularExpressionClassChar", null, null), false, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxpdGVyLXN0YXIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhciIpKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25DbGFzc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxpdGVyLXN0YXIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhciIpKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class Statement {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiU3RhdGVtZW50IikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgiY2xhc3MiKSxleGNlcHQoImZ1bmN0aW9uIil9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4152, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4153, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(4151, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiU3RhdGVtZW50IikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgiY2xhc3MiKSxleGNlcHQoImZ1bmN0aW9uIil9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic3dpdGNoQ2FzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInN3aXRjaCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNvbmQiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoInsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNsYXVzZXMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJDYXNlQ2xhdXNlIiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4157, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4162, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4164, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4159, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4171, 11, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4165, 8, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4163, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4158, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4172, 12, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4160, 4, "Expression", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4166, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(4169, 10, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00, new NonTerminalStackNode<IConstructor>(4167, 0, "CaseClause", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4168, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4156, 0, cHJvZChsaXQoInN3aXRjaCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic3dpdGNoQ2FzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInN3aXRjaCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNvbmQiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoInsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNsYXVzZXMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJDYXNlQ2xhdXNlIiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYnJlYWtOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiYnJlYWsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4176, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4177, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4175, 0, cHJvZChsaXQoImJyZWFrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSldLHt9KQ0000, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYnJlYWtOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiYnJlYWsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZm9ySW5EZWNsYXJhdGlvbiIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImZvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRGVjbGFyYXRvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJGb3JCaW5kaW5nIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4183, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4192, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4194, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4187, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4181, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4185, 5, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4188, 8, cHJvZChsaXQoImluIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pXSx7fSk00, new int[] {105,110}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4184, 4, "Declarator", null, null);
      tmp[14] = new NonTerminalStackNode<IConstructor>(4195, 14, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4193, 12, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4182, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4186, 6, "ForBinding", null, null);
      tmp[10] = new NonTerminalStackNode<IConstructor>(4190, 10, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4180, 0, cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4189, 9, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZm9ySW5EZWNsYXJhdGlvbiIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImZvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRGVjbGFyYXRvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJGb3JCaW5kaW5nIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaWZUaGVuIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiaWYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kIixzb3J0KCJFeHByZXNzaW9uIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGVtcHR5KCkse1xub3QtZm9sbG93KGxpdCgiZWxzZSIpKX0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[11];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4207, 8, "Statement", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4204, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4199, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4206, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4201, 3, "layouts_LAYOUTLIST", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4208, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4198, 0, cHJvZChsaXQoImlmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pXSx7fSk00, new int[] {105,102}, null, null);
      tmp[10] = new EmptyStackNode<IConstructor>(4211, 10, cmVndWxhcihlbXB0eSgpKQ0000, null, new ICompletionFilter[] {new StringFollowRestriction(new int[] {101,108,115,101})});
      tmp[2] = new LiteralStackNode<IConstructor>(4200, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4205, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4202, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaWZUaGVuIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiaWYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kIixzb3J0KCJFeHByZXNzaW9uIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGVtcHR5KCkse1xub3QtZm9sbG93KGxpdCgiZWxzZSIpKX0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZGVidWdnZXIiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJkZWJ1Z2dlciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjsiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4215, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4214, 0, cHJvZChsaXQoImRlYnVnZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {100,101,98,117,103,103,101,114}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4216, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZGVidWdnZXIiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJkZWJ1Z2dlciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjsiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiY29udGludWVOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiY29udGludWUiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(4221, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4219, 0, cHJvZChsaXQoImNvbnRpbnVlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4220, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiY29udGludWVOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiY29udGludWUiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU3RhdGVtZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTdGF0ZW1lbnQiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4229, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4226, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4224, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4228, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4227, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4225, 1, cHJvZChsaXQoInNvcnQoXCJTdGF0ZW1lbnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU3RhdGVtZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTdGF0ZW1lbnQiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZW1wdHkiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4233, 0, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZW1wdHkiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidHJ5Q2F0Y2hGaW5hbGx5Iixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgidHJ5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImNhdGNoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[16] = new NonTerminalStackNode<IConstructor>(4252, 16, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4245, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4246, 10, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4236, 0, cHJvZChsaXQoInRyeSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKV0se30p, new int[] {116,114,121}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4242, 6, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4238, 2, "Statement", null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4250, 14, cHJvZChsaXQoImZpbmFsbHkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pXSx7fSk00, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4248, 12, "Statement", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4240, 4, cHJvZChsaXQoImNhdGNoIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pXSx7fSk00, new int[] {99,97,116,99,104}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4244, 8, "Id", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4251, 15, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4243, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4237, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4241, 5, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4249, 13, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4239, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4247, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidHJ5Q2F0Y2hGaW5hbGx5Iixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgidHJ5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImNhdGNoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZG9XaGlsZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImRvIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[9] = new NonTerminalStackNode<IConstructor>(4265, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4255, 0, cHJvZChsaXQoImRvIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pXSx7fSk00, new int[] {100,111}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4266, 10, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4261, 6, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4257, 2, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4268, 12, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4259, 4, cHJvZChsaXQoIndoaWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {119,104,105,108,101}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4263, 8, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4260, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4256, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4262, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4258, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4267, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZG9XaGlsZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImRvIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZm9yRG9EZWNsYXJhdGlvbnMiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgib3BzIixcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[19];
      
      tmp[10] = new SeparatedListStackNode<IConstructor>(4289, 10, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(4285, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4286, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4287, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4288, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4271, 0, cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {102,111,114}, null, null);
      tmp[16] = new LiteralStackNode<IConstructor>(4301, 16, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4284, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4275, 4, "Declarator", null, null);
      tmp[14] = new SeparatedListStackNode<IConstructor>(4298, 14, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(4294, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4295, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4296, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4297, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4292, 12, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[18] = new NonTerminalStackNode<IConstructor>(4303, 18, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4273, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new SeparatedListStackNode<IConstructor>(4281, 6, cmVndWxhcihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00, new NonTerminalStackNode<IConstructor>(4277, 0, "VariableDeclarationNoIn", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4278, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4279, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4280, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4300, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4283, 8, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[17] = new NonTerminalStackNode<IConstructor>(4302, 17, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4274, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4291, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4293, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4282, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4276, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4272, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZm9yRG9EZWNsYXJhdGlvbnMiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgib3BzIixcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicmV0dXJuTm9FeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJyZXR1cm4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4307, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4308, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4306, 0, cHJvZChsaXQoInJldHVybiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicmV0dXJuTm9FeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJyZXR1cm4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidGhyb3dOb0V4cCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRocm93IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4312, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4313, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4311, 0, cHJvZChsaXQoInRocm93IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pXSx7fSk00, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidGhyb3dOb0V4cCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRocm93IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidHJ5Q2F0Y2giLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0cnkiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiY2F0Y2giKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[7] = new NonTerminalStackNode<IConstructor>(4323, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4321, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4317, 1, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4327, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4319, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4324, 8, "Id", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4318, 2, "Statement", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4322, 6, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4320, 4, cHJvZChsaXQoImNhdGNoIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pXSx7fSk00, new int[] {99,97,116,99,104}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4328, 12, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4325, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4326, 10, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4316, 0, cHJvZChsaXQoInRyeSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKV0se30p, new int[] {116,114,121}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidHJ5Q2F0Y2giLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0cnkiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiY2F0Y2giKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZm9yRG8iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kcyIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkV4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJvcHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4334, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4351, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4358, 13, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4332, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4340, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4342, 7, "layouts_LAYOUTLIST", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4360, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new SeparatedListStackNode<IConstructor>(4347, 8, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(4343, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4344, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4345, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4346, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(4339, 4, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(4335, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4336, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4337, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4338, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(4356, 12, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(4352, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4353, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4354, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4355, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4359, 14, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4333, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4341, 6, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4350, 10, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4331, 0, cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4349, 9, "layouts_LAYOUTLIST", null, null);
      tmp[16] = new NonTerminalStackNode<IConstructor>(4361, 16, "Statement", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZm9yRG8iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kcyIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkV4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJvcHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU3RhdGVtZW50XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4368, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4367, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4365, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJTdGF0ZW1lbnRcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4369, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4366, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4364, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU3RhdGVtZW50XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgid2hpbGVEbyIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4384, 8, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4378, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4383, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4381, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4376, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4375, 0, cHJvZChsaXQoIndoaWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {119,104,105,108,101}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4379, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4377, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4382, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgid2hpbGVEbyIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidGhyb3dFeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0aHJvdyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4391, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4388, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4387, 0, cHJvZChsaXQoInRocm93IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pXSx7fSk00, new int[] {116,104,114,111,119}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4392, 4, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4389, 2, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidGhyb3dFeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0aHJvdyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYnJlYWtMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImJyZWFrIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4398, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4396, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4395, 0, cHJvZChsaXQoImJyZWFrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSldLHt9KQ0000, new int[] {98,114,101,97,107}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4399, 4, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4397, 2, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYnJlYWtMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImJyZWFrIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidmFyRGVjbCIsc29ydCgiU3RhdGVtZW50IikpLFtzb3J0KCJWYXJEZWNsIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4402, 0, "VarDecl", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidmFyRGVjbCIsc29ydCgiU3RhdGVtZW50IikpLFtzb3J0KCJWYXJEZWNsIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicmV0dXJuRXhwIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgicmV0dXJuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4409, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4406, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4405, 0, cHJvZChsaXQoInJldHVybiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {114,101,116,117,114,110}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4410, 4, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4407, 2, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicmV0dXJuRXhwIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgicmV0dXJuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaWZUaGVuRWxzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImlmIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImVsc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4417, 4, "Expression", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4426, 12, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4415, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4420, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4413, 0, cHJvZChsaXQoImlmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pXSx7fSk00, new int[] {105,102}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4424, 10, cHJvZChsaXQoImVsc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {101,108,115,101}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4423, 9, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4425, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4416, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4414, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4419, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4421, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4422, 8, "Statement", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaWZUaGVuRWxzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImlmIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImVsc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgid2l0aCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndpdGgiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJzY29wZSIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4433, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4431, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4436, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4429, 0, cHJvZChsaXQoIndpdGgiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExOSwxMTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000, new int[] {119,105,116,104}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4432, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4435, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4430, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4437, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4438, 8, "Statement", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgid2l0aCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndpdGgiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJzY29wZSIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiY29udGludWVMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImNvbnRpbnVlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4441, 0, cHJvZChsaXQoImNvbnRpbnVlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4443, 2, "Id", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4445, 4, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4442, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4444, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiY29udGludWVMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImNvbnRpbnVlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIlN0YXRlbWVudCIpKSxbc29ydCgiRnVuY3Rpb24iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4448, 0, "Function", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIlN0YXRlbWVudCIpKSxbc29ydCgiRnVuY3Rpb24iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYmxvY2siLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4451, 0, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4457, 4, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(4455, 2, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(4453, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4454, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4456, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4452, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYmxvY2siLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZm9ySW4iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJ2YXIiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[10] = new LiteralStackNode<IConstructor>(4472, 10, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4460, 0, cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4471, 9, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4474, 12, "Statement", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4464, 4, "Expression", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4467, 6, cHJvZChsaXQoImluIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pXSx7fSk00, new int[] {105,110}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4462, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4469, 8, "Expression", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4473, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4463, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4468, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4461, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4466, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZm9ySW4iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJ2YXIiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibGFiZWxlZCIsc29ydCgiU3RhdGVtZW50IikpLFtsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4477, 0, "Id", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4481, 4, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4479, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4480, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4478, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibGFiZWxlZCIsc29ydCgiU3RhdGVtZW50IikpLFtsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidHJ5RmluYWxseSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRyeSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4484, 0, cHJvZChsaXQoInRyeSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKV0se30p, new int[] {116,114,121}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4488, 4, cHJvZChsaXQoImZpbmFsbHkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pXSx7fSk00, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4486, 2, "Statement", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4490, 6, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4487, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4489, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4485, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidHJ5RmluYWxseSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRyeSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiU3RhdGVtZW50IikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgiY2xhc3MiKSxleGNlcHQoImZ1bmN0aW9uIil9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgic3dpdGNoQ2FzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInN3aXRjaCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNvbmQiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoInsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNsYXVzZXMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJDYXNlQ2xhdXNlIiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYnJlYWtOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiYnJlYWsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiZm9ySW5EZWNsYXJhdGlvbiIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImZvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRGVjbGFyYXRvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJGb3JCaW5kaW5nIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiaWZUaGVuIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiaWYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kIixzb3J0KCJFeHByZXNzaW9uIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGVtcHR5KCkse1xub3QtZm9sbG93KGxpdCgiZWxzZSIpKX0pXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZGVidWdnZXIiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJkZWJ1Z2dlciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjsiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiY29udGludWVOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiY29udGludWUiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU3RhdGVtZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTdGF0ZW1lbnQiKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZW1wdHkiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgidHJ5Q2F0Y2hGaW5hbGx5Iixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgidHJ5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImNhdGNoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZG9XaGlsZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImRvIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZm9yRG9EZWNsYXJhdGlvbnMiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgib3BzIixcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicmV0dXJuTm9FeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJyZXR1cm4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgidGhyb3dOb0V4cCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRocm93IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgidHJ5Q2F0Y2giLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0cnkiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiY2F0Y2giKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZm9yRG8iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kcyIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkV4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJvcHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU3RhdGVtZW50XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgid2hpbGVEbyIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgidGhyb3dFeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0aHJvdyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYnJlYWtMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImJyZWFrIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgidmFyRGVjbCIsc29ydCgiU3RhdGVtZW50IikpLFtzb3J0KCJWYXJEZWNsIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicmV0dXJuRXhwIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgicmV0dXJuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiaWZUaGVuRWxzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImlmIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImVsc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgid2l0aCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndpdGgiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJzY29wZSIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiY29udGludWVMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImNvbnRpbnVlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIlN0YXRlbWVudCIpKSxbc29ydCgiRnVuY3Rpb24iKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiYmxvY2siLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZm9ySW4iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJ2YXIiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgibGFiZWxlZCIsc29ydCgiU3RhdGVtZW50IikpLFtsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgidHJ5RmluYWxseSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRyeSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class LHSExpression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMSFNFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxIU0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxIU0V4cHJlc3Npb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(4521, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4523, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4526, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4522, 1, cHJvZChsaXQoInNvcnQoXCJMSFNFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc2LDc2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,76,72,83,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4525, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4524, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMSFNFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxIU0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxIU0V4cHJlc3Npb24iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJMSFNFeHByZXNzaW9uIiksW2NvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJhcnJheSIpLGV4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpLGV4Y2VwdCgiYXNzaWduIil9KV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4530, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMSFNFeHByZXNzaW9uIiksW2NvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJhcnJheSIpLGV4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpLGV4Y2VwdCgiYXNzaWduIil9KV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMSFNFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxIU0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxIU0V4cHJlc3Npb24iKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJMSFNFeHByZXNzaW9uIiksW2NvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJhcnJheSIpLGV4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpLGV4Y2VwdCgiYXNzaWduIil9KV0se30p(builder);
      
    }
  }
	
  protected static class Literal {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiU3RyaW5nIildLHt0YWcoImNhdGVnb3J5IigiU3RyaW5nIikpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4542, 0, "String", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiU3RyaW5nIildLHt0YWcoImNhdGVnb3J5IigiU3RyaW5nIikpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiUmVndWxhckV4cHJlc3Npb24iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4544, 0, "RegularExpression", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiUmVndWxhckV4cHJlc3Npb24iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIkJvb2xlYW4iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4546, 0, "Boolean", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIkJvb2xlYW4iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIk51bWVyaWMiKV0se3RhZygiY2F0ZWdvcnkiKCJOdW1lcmljIikpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4548, 0, "Numeric", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIk51bWVyaWMiKV0se3RhZygiY2F0ZWdvcnkiKCJOdW1lcmljIikpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xpdCgibnVsbCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4550, 0, cHJvZChsaXQoIm51bGwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSldLHt9KQ0000, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMaXRlcmFsIiksW2xpdCgibnVsbCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMaXRlcmFsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxpdGVyYWxcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxpdGVyYWwiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4558, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4555, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4557, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4556, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4554, 1, cHJvZChsaXQoInNvcnQoXCJMaXRlcmFsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc2LDc2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,76,105,116,101,114,97,108,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4553, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMaXRlcmFsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxpdGVyYWxcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxpdGVyYWwiKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiU3RyaW5nIildLHt0YWcoImNhdGVnb3J5IigiU3RyaW5nIikpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiUmVndWxhckV4cHJlc3Npb24iKV0se30p(builder);
      
        _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIkJvb2xlYW4iKV0se30p(builder);
      
        _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIk51bWVyaWMiKV0se3RhZygiY2F0ZWdvcnkiKCJOdW1lcmljIikpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xpdCgibnVsbCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMaXRlcmFsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxpdGVyYWxcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxpdGVyYWwiKSkpfSk00(builder);
      
    }
  }
	
  protected static class ArgExpression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkFyZ0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(4569, 1, cHJvZChsaXQoInNvcnQoXCJBcmdFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,65,114,103,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4573, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4570, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4572, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4571, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4568, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkFyZ0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJBcmdFeHByZXNzaW9uIiksW3NvcnQoIkV4cHJlc3Npb24iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4576, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJBcmdFeHByZXNzaW9uIiksW3NvcnQoIkV4cHJlc3Npb24iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiQXJnRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4584, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4581, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4580, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIkFyZ0V4cHJlc3Npb25cIiksW2xpdChcIixcIildKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,65,114,103,69,120,112,114,101,115,115,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4579, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4583, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4582, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiQXJnRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkFyZ0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJBcmdFeHByZXNzaW9uIiksW3NvcnQoIkV4cHJlc3Npb24iKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiQXJnRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(builder);
      
    }
  }
	
  protected static class PropertyName {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbc29ydCgiTnVtZXJpYyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4884, 0, "Numeric", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbc29ydCgiTnVtZXJpYyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJTdHJpbmciKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4886, 0, "String", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJTdHJpbmciKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eU5hbWUiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlOYW1lXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eU5hbWUiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4893, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4892, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4890, 1, cHJvZChsaXQoInNvcnQoXCJQcm9wZXJ0eU5hbWVcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,78,97,109,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4894, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4891, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4889, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eU5hbWUiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlOYW1lXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eU5hbWUiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJJZCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4897, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJJZCIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbc29ydCgiTnVtZXJpYyIpXSx7fSk00(builder);
      
        _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJTdHJpbmciKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eU5hbWUiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlOYW1lXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eU5hbWUiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJJZCIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class EscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNykscmFuZ2UoMTIwLDEyMCldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(4901, 0, new int[][]{{117,117},{120,120}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNykscmFuZ2UoMTIwLDEyMCldKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4903, 0, "SingleEscapeCharacter", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXNjYXBlQ2hhcmFjdGVyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4911, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4908, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4906, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4910, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4909, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4907, 1, cHJvZChsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXNjYXBlQ2hhcmFjdGVyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(4914, 0, new int[][]{{48,57}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNykscmFuZ2UoMTIwLDEyMCldKV0se30p(builder);
      
        _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXNjYXBlQ2hhcmFjdGVyIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class CharacterEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5032, 1, cHJvZChsaXQoInNvcnQoXCJDaGFyYWN0ZXJFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMywxMTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,67,104,97,114,97,99,116,101,114,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5035, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5034, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5033, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5036, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5031, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5039, 0, "NonEscapeCharacter", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5041, 0, "SingleEscapeCharacter", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000(builder);
      
        _init_cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000(builder);
      
    }
  }
	
  protected static class RegularExpressionChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5145, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5147, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5149, 0, new int[][]{{1,9},{11,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5153, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5156, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5155, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5154, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5157, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5152, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5163, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODIsODIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5166, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5165, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5164, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5167, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5162, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKV0se30p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKV0se30p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKX0p(builder);
      
    }
  }
	
  protected static class PropertyAssignment {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpKSxbc29ydCgiUHJvcGVydHlOYW1lIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(5174, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5175, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5177, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(5173, 0, "PropertyName", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5176, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpKSxbc29ydCgiUHJvcGVydHlOYW1lIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlBc3NpZ25tZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(5184, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5183, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5180, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5182, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5181, 1, cHJvZChsaXQoInNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5185, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlBc3NpZ25tZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbc29ydCgiTWV0aG9kRGVmaW5pdGlvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5188, 0, "MethodDefinition", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbc29ydCgiTWV0aG9kRGVmaW5pdGlvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhci1zZXBzKHNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5191, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5193, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5195, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5194, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5196, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5192, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlByb3BlcnR5QXNzaWdubWVudFwiKSxbbGl0KFwiLFwiKV0pIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhci1zZXBzKHNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpKSxbc29ydCgiUHJvcGVydHlOYW1lIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlBc3NpZ25tZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbc29ydCgiTWV0aG9kRGVmaW5pdGlvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhci1zZXBzKHNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(builder);
      
    }
  }
	
  protected static class Initializer {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJJbml0aWFsaXplciIpLFtsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(5285, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(5283, 0, cHJvZChsaXQoIj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {61}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5284, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJJbml0aWFsaXplciIpLFtsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJJbml0aWFsaXplciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiSW5pdGlhbGl6ZXIiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5288, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5290, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5293, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5289, 1, cHJvZChsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMiwxMjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,73,110,105,116,105,97,108,105,122,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5292, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5291, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJJbml0aWFsaXplciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiSW5pdGlhbGl6ZXIiKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJJbml0aWFsaXplciIpLFtsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJJbml0aWFsaXplciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiSW5pdGlhbGl6ZXIiKSkpfSk00(builder);
      
    }
  }
	
  protected static class LAYOUT {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTEFZT1VUIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5300, 1, cHJvZChsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzYsNzYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OSw4OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzksNzkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg1LDg1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4NCw4NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,76,65,89,79,85,84,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5303, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5302, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5301, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5304, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5299, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTEFZT1VUIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIldoaXRlc3BhY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5307, 0, "Whitespace", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIldoaXRlc3BhY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5315, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5312, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5310, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5314, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5313, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5311, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Niw3NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjUsNjUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg5LDg5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3OSw3OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODUsODUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg0LDg0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,76,65,89,79,85,84,34,41,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIkNvbW1lbnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5319, 0, "Comment", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIkNvbW1lbnQiKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTEFZT1VUIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIldoaXRlc3BhY2UiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKSl9KQ0000(builder);
      
        _init_cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIkNvbW1lbnQiKV0se30p(builder);
      
    }
  }
	
  protected static class DecimalInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5364, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OSw1NyldKSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSl9KV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(5366, 0, new int[][]{{49,57}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(5370, 1, cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5367, 0, new int[][]{{48,57}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OSw1NyldKSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSl9KV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWxJbnRlZ2VyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2ltYWxJbnRlZ2VyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkRlY2ltYWxJbnRlZ2VyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5378, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5375, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5377, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5376, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5373, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5374, 1, cHJvZChsaXQoInNvcnQoXCJEZWNpbWFsSW50ZWdlclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,68,101,99,105,109,97,108,73,110,116,101,103,101,114,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWxJbnRlZ2VyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2ltYWxJbnRlZ2VyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkRlY2ltYWxJbnRlZ2VyIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKV0se30p(builder);
      
        _init_cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OSw1NyldKSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSl9KV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWxJbnRlZ2VyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2ltYWxJbnRlZ2VyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkRlY2ltYWxJbnRlZ2VyIikpKX0p(builder);
      
    }
  }
	
  protected static class VariableDeclarationNoIn {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5535, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5538, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5533, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5534, 1, cHJvZChsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Niw4NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5537, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5536, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5544, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5547, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5542, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5543, 1, cHJvZChsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzgsNzgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDczLDczKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5546, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5545, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5555, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLGNvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJpbm4iKX0pKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5559, 0, "Id", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5565, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5562, 2, cHJvZChsaXQoIj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5563, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5561, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLGNvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJpbm4iKX0pKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLGNvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJpbm4iKX0pKV0se30p(builder);
      
    }
  }
	
  protected static class SingleStringChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzgpLHJhbmdlKDQwLDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5684, 0, new int[][]{{1,9},{11,38},{40,91},{93,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzgpLHJhbmdlKDQwLDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5687, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5692, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5689, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5691, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5690, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5688, 1, cHJvZChsaXQoInNvcnQoXCJTaW5nbGVTdHJpbmdDaGFyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(5695, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5696, 1, "EscapeSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5704, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5701, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5703, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5702, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5699, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5700, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJTaW5nbGVTdHJpbmdDaGFyXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKSl9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzgpLHJhbmdlKDQwLDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKSl9KQ0000(builder);
      
    }
  }
	
  protected static class Params {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJQYXJhbXMiKSxbbGFiZWwoImxzdCIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlBhcmFtIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(5948, 0, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiUGFyYW0iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(5944, 0, "Param", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(5945, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(5946, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(5947, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQYXJhbXMiKSxbbGFiZWwoImxzdCIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlBhcmFtIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSldLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbXMiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUGFyYW1zXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQYXJhbXMiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5957, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5954, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5952, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5956, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5955, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5953, 1, cHJvZChsaXQoInNvcnQoXCJQYXJhbXNcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,80,97,114,97,109,115,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbXMiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUGFyYW1zXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQYXJhbXMiKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJQYXJhbXMiKSxbbGFiZWwoImxzdCIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlBhcmFtIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSldLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbXMiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUGFyYW1zXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQYXJhbXMiKSkpfSk00(builder);
      
    }
  }
	
  // Parse methods    
  
  public AbstractStackNode<IConstructor>[] String() {
    return String.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Decimal() {
    return Decimal.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Function() {
    return Function.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Expression() {
    return Expression.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] layouts_$default$() {
    return layouts_$default$.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionFlags() {
    return RegularExpressionFlags.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Source() {
    return Source.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionFirstChar() {
    return RegularExpressionFirstChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] HexDigit() {
    return HexDigit.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] CommentChar() {
    return CommentChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] ForBinding() {
    return ForBinding.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpression() {
    return RegularExpression.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] UnicodeEscapeSequence() {
    return UnicodeEscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] CaseClause() {
    return CaseClause.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] VariableDeclaration() {
    return VariableDeclaration.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionBody() {
    return RegularExpressionBody.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Declarator() {
    return Declarator.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] VarDecl() {
    return VarDecl.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] DoubleStringChar() {
    return DoubleStringChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Id() {
    return Id.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] NonEscapeCharacter() {
    return NonEscapeCharacter.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionClassChar() {
    return RegularExpressionClassChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Whitespace() {
    return Whitespace.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] HexEscapeSequence() {
    return HexEscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] MethodDefinition() {
    return MethodDefinition.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] layouts_LAYOUTLIST() {
    return layouts_LAYOUTLIST.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Comment() {
    return Comment.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Reserved() {
    return Reserved.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Boolean() {
    return Boolean.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] SingleEscapeCharacter() {
    return SingleEscapeCharacter.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] HexInteger() {
    return HexInteger.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionBackslashSequence() {
    return RegularExpressionBackslashSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] EscapeSequence() {
    return EscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] ExponentPart() {
    return ExponentPart.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] SignedInteger() {
    return SignedInteger.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Numeric() {
    return Numeric.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] start__Source() {
    return start__Source.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Param() {
    return Param.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionClass() {
    return RegularExpressionClass.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Statement() {
    return Statement.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] LHSExpression() {
    return LHSExpression.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Literal() {
    return Literal.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] ArgExpression() {
    return ArgExpression.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] PropertyName() {
    return PropertyName.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] EscapeCharacter() {
    return EscapeCharacter.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] CharacterEscapeSequence() {
    return CharacterEscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionChar() {
    return RegularExpressionChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] PropertyAssignment() {
    return PropertyAssignment.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Initializer() {
    return Initializer.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] LAYOUT() {
    return LAYOUT.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] DecimalInteger() {
    return DecimalInteger.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] VariableDeclarationNoIn() {
    return VariableDeclarationNoIn.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] SingleStringChar() {
    return SingleStringChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Params() {
    return Params.EXPECTS;
  }
}