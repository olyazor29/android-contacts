package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<E> {
    boolean theSameAs(E item);

    boolean equals(Object item);
}
