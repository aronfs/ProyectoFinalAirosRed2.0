/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author aaron
 */
public class ReportesStock {

    private String Cod_Stock;
    private float IVA;
    private int StockActual;
    private String Activo;
    private String Categoria;

    public ReportesStock() {
    }

    public ReportesStock(String Cod_Stock, float IVA, int StockActual, String Activo, String Categoria) {
        this.Cod_Stock = Cod_Stock;
        this.IVA = IVA;
        this.StockActual = StockActual;
        this.Activo = Activo;
        this.Categoria = Categoria;
    }

    public String getCod_Stock() {
        return Cod_Stock;
    }

    public void setCod_Stock(String Cod_Stock) {
        this.Cod_Stock = Cod_Stock;
    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public int getStockActual() {
        return StockActual;
    }

    public void setStockActual(int StockActual) {
        this.StockActual = StockActual;
    }

    public String getActivo() {
        return Activo;
    }

    public void setActivo(String Activo) {
        this.Activo = Activo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

}
