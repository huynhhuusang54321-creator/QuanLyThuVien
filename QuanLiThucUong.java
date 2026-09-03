/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.quanlithucuong;

import Controller.NhanVienController;
import Controller.ThucUongController;
import Repository.ThucUongRepository;
import Service.NhanVienService;
import Service.ThucUongService;
import View.NhanVienView;
import View.ThucUongView;

/**
 *
 * @author DELL
 */
public class QuanLiThucUong {

    public static void main(String[] args) {
        ThucUongView view = new ThucUongView();
        ThucUongService service = new ThucUongService();
        ThucUongController controller = new ThucUongController(view, service);
        NhanVienView viewNV = new NhanVienView();
        NhanVienService serviceNV = new NhanVienService();
        NhanVienController controllerNV = new NhanVienController(viewNV, serviceNV);
        viewNV.setVisible(true);
        view.setVisible(true);
    }
}
