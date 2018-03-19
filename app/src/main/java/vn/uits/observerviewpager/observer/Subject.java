package vn.uits.observerviewpager.observer;

/**
 * Copyright © 2017 BAP CO., LTD
 * Created by PHUQUY on 3/14/18.
 */

public interface Subject {

    void registerObserver(RepositoryObserver repositoryObserver);

    void removeObserver(RepositoryObserver repositoryObserver);

    void notifyObservers();

}
