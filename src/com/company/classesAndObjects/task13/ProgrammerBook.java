package com.company.classesAndObjects.task13;

import com.company.classesAndObjects.task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        ProgrammerBook that = (ProgrammerBook) obj;
        return level == that.level && this.language.equals(that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return super.toString() + "; Язык: " + language + "; Уровень: " + level;
    }
}
