package com.example.soccerteammanagement.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public interface Repository<T> {
    List<T> items = new ArrayList<>();

    List<T> getAll();

    void add(T item);

    List<T> filter(Predicate<T> predicate);
}
