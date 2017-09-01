//
//  Cadastro.swift
//  ColetaSeletiva
//
//  Created by admin on 31/08/17.
//  Copyright © 2017 ColetaSeletiva. All rights reserved.
//

import Foundation
class Cadastro: NSObject{
    var lista: Array<Local>!
    var listaLocaisEspecificos: Array<Local>!
    
    override init() {
        super.init()
        self.listaLocaisEspecificos = Array<Local>()
        
    }
    
    func add(nova: Local) {
        self.lista.append(nova)
        //self.salvar()
    }
    
    func get(index: Int) -> Local {
        return self.lista[index]
    }
    
    func size() -> Int{
        return self.listaLocaisEspecificos.count
    }
    
    func del(index: Int) {
        self.lista.remove(at: index)
        //self.salvar()
    }
    
    func mov(origem: Int, destino: Int){
        let aux = self.lista[origem]
        self.lista[origem] = self.lista[destino]
        self.lista[destino] = aux
        //self.salvar()
    }
    
    func getLocalEspecifico(index: Int) -> Local {
        return self.listaLocaisEspecificos[index]
    }
    
//    func sizeLocaisEspecificos() -> Int{
//        return self.listaLocaisEspecificos.count
//    }
    
    func getLista() -> Array<Local>{
        return self.lista
    }
    
    func addLocaisEspecificos(local: Local){
        self.listaLocaisEspecificos.append(local)
    }
}

