package on_tap.ss2.service;

import on_tap.ss2.common.CheckException;

public interface IMonHoc {
    void display();
    void add();
    void edit();
    void remove() throws CheckException;
}
