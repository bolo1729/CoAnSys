/*
 * This file is part of CoAnSys project.
 * Copyright (c) 20012-2013 ICM-UW
 * 
 * CoAnSys is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * CoAnSys is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with CoAnSys. If not, see <http://www.gnu.org/licenses/>.
 */

package pl.edu.icm.coansys.disambiguation.work.comparator;

import pl.edu.icm.coansys.models.DocumentProtos.DocumentWrapper;

/**
 * A set of configuration options influencing the result of 
 * {@link WorkTitleComparator#sameTitles(DocumentWrapper, DocumentWrapper)} 
 * 
 * @author lukdumi
 *
 */
public class WorkTitleComparatorConfiguration {

    private int titleMaxLevenshteinDistance = 5;
    private int titleMostMeaningfulEndLength = 7;
    private int titleEndMaxLevenshteinDistance = 1;
    private int titleLevenshteinDistancePerPart = 1;
    private int titlePartLength = 7;
    private int titleLengthExactComparison = 7;
    
    //******************** GETTERS ********************
    
    
    
    

    /** 
     * Max levenshtein distance of the publication title
     * Defaults to 5 
     * 
     * */
    private int getTitleMaxLevenshteinDistance() {
        return titleMaxLevenshteinDistance;
    }

    /**
     * The end of title is of special meaning when considering the equality of the publication.
     * For the end of the title it will be applied additionally {@link #getTitleEndMaxLevenshteinDistance()}
     * 
     * Think about it: <br/>
     * Aspiracje integracyjne państw śródziemnomorskich - Turcja <br/>
     * and <br/>
     * Aspiracje integracyjne państw śródziemnomorskich - Malta <br/>
     * are probably not the duplicates of the same article
     */
    public int getTitleMostMeaningfulEndLength() {
        return titleMostMeaningfulEndLength;
    }
    
    /**
     * The max levenshtein distance of the title end specified by {@link #getTitleMostMeaningfulEndLength()}
     */
    public int getTitleEndMaxLevenshteinDistance() {
        return titleEndMaxLevenshteinDistance;
    }

    /** the levenshtein distance per part {@link WorkTitleComparatorConfiguration#getTitlePartLength()} */
    private int getTitleLevenshteinDistancePerPart() {
        return titleLevenshteinDistancePerPart;
    }

    /** the length of parts of the title, the more parts the bigest levenenshtein distance will be allowed */
    private int getTitlePartLength() {
        return titlePartLength;
    }

    /**
     * If the title is shorter that this value, then 0 levenshtein distance will applied
     */
    public int getTitleLengthExactComparison() {
        return titleLengthExactComparison;
    }

   
    
    //******************** LOGIC ********************
    
    
    
    
    //******** quasi builder methods */
    
    public static WorkTitleComparatorConfiguration create() {
        return new WorkTitleComparatorConfiguration();
    }
    
    public WorkTitleComparatorConfiguration byTitleMaxLevenshteinDistance(int titleMaxLevenshteinDistance) {
        this.setTitleMaxLevenshteinDistance(titleMaxLevenshteinDistance);
        return this;
    }
    
    /**
     * Returns the levenshtein distance that should be used to compare two titles 
     */
    public int getRealLevenshteinDistance(String title1, String title2) {
        int title1Length = title1.length();
        int title2Length = title2.length();
        int maxLength = Math.max(title1Length, title2Length);
        if (maxLength<=getTitleLengthExactComparison()) {
            return 0;
        }
        int numberOfParts = maxLength/getTitlePartLength();
        int levenstein = numberOfParts*getTitleLevenshteinDistancePerPart();
        return Math.min(levenstein, getTitleMaxLevenshteinDistance());
    }
    
    
    
    //******************** SETTERS ********************
    
    public void setTitleMaxLevenshteinDistance(int titleMaxLevenshteinDistance) {
        this.titleMaxLevenshteinDistance = titleMaxLevenshteinDistance;
    }

    public void setTitleMostMeaningfulEndLength(int titleMostMeaningfulEndLength) {
        this.titleMostMeaningfulEndLength = titleMostMeaningfulEndLength;
    }
    
    public void setTitleEndMaxLevenshteinDistance(int titleEndMaxLevenshteinDistance) {
        this.titleEndMaxLevenshteinDistance = titleEndMaxLevenshteinDistance;
    }

    public void setTitleLevenshteinDistancePerPart(int titleLevenshteinDistancePerPart) {
        this.titleLevenshteinDistancePerPart = titleLevenshteinDistancePerPart;
    }

    public void setTitlePartLength(int titlePartLength) {
        this.titlePartLength = titlePartLength;
    }

    public void setTitleLengthExactComparison(int titleLengthExactComparison) {
        this.titleLengthExactComparison = titleLengthExactComparison;
    }

    
}
