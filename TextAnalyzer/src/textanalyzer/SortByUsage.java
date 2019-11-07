
package textanalyzer;

import java.util.*; 

/**
 *
 * @author Ian
 */
//For sorting Methods.wordsort
class SortByUsage implements Comparator<Word>{
    public int compare(Word a, Word b){
        return b.instances()-a.instances();
    }
}
