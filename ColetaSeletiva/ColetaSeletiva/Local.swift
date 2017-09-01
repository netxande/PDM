//
//  Local.swift
//  ColetaSeletiva
//
//  Created by admin on 31/08/17.
//  Copyright © 2017 ColetaSeletiva. All rights reserved.
//

import Foundation

class Local: NSObject, NSCoding {
    var endereco: String!
    var localizacao: String!
    var tipo: String!
    
    override var description: String{
        return "\(self.endereco!)"
    }
    
    init(endereco: String, localizacao: String, tipo: String) {
        self.endereco = endereco
        self.localizacao = localizacao
        self.tipo = tipo
    }
    
    // arquivo -> memória
    required init?(coder aDecoder: NSCoder) {
        self.endereco = aDecoder.decodeObject(forKey: "endereco") as! String
        self.localizacao = aDecoder.decodeObject(forKey: "localizacao") as! String
        self.tipo = aDecoder.decodeObject(forKey: "tipo") as! String
    }
    
    // memória -> arquivo
    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.endereco, forKey: "endereco")
        aCoder.encode(self.localizacao, forKey: "localizacao")
        aCoder.encode(self.tipo, forKey: "tipo")
    }

    func getTipo() -> String {
        return self.tipo
    }

}
