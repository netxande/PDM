//
//  :
//  ColetaSeletiva
//
//  Created by admin on 31/08/17.
//  Copyright © 2017 ColetaSeletiva. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    var cadastro = Cadastro()

    override func viewDidLoad() {
        super.viewDidLoad()
            print("Chegou em didiLoad de viewController")
        let obj = NSKeyedUnarchiver.unarchiveObject(withFile: self.arquivo())
        if (obj != nil){
            self.cadastro.lista = obj as! Array<Local>
        }else{
            self.cadastro.lista = Array<Local>()
            self.addLocaisLista()
        }
        print(self.arquivo())

        
    }
    
    func arquivo() -> String{
        let path = NSSearchPathForDirectoriesInDomains(FileManager.SearchPathDirectory.documentDirectory, FileManager.SearchPathDomainMask.userDomainMask, true)[0]
        return "\(path)/locais.coletaseletiva"
    }
    
    func salvar(){
        NSKeyedArchiver.archiveRootObject(self.cadastro.lista, toFile: self.arquivo())
    }
    
    func addLocaisLista() {
        let local1 = Local(endereco: "Rua Azul Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "azul")
        let local2 = Local(endereco: "Rua Amarelo Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "amarelo")
        let local3 = Local(endereco: "Rua Vermelho Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "vermelho")
        let local4 = Local(endereco: "Rua Preto Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "preto")
        let local5 = Local(endereco: "Rua Vermelho Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "vermelho")
        let local6 = Local(endereco: "Rua Verde Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "verde")
        let local7 = Local(endereco: "Rua Azul Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "azul")
        let local8 = Local(endereco: "Rua Branco Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "branco")
        let local9 = Local(endereco: "Rua Lilas Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "lilas")
        let local10 = Local(endereco: "Rua Vermelho Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "vermelho")
        let local11 = Local(endereco: "Rua Laranja Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "laranja")
        let local12 = Local(endereco: "Rua Marrom Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "marrom")
        let local13 = Local(endereco: "Rua Cinza Xavier de Oliveira",localizacao: "geo:-702355, 1536400",tipo: "cinza")

        self.cadastro.add(nova: local1)
        self.cadastro.add(nova: local2)
        self.cadastro.add(nova: local3)
        self.cadastro.add(nova: local4)
        self.cadastro.add(nova: local5)
        self.cadastro.add(nova: local6)
        self.cadastro.add(nova: local7)
        self.cadastro.add(nova: local8)
        self.cadastro.add(nova: local9)
        self.cadastro.add(nova: local10)
        self.cadastro.add(nova: local11)
        self.cadastro.add(nova: local12)
        self.cadastro.add(nova: local13)
        
        
        self.salvar()
        
    }
    
    func alerta(title: String, message: String)  {
        let alert = UIAlertController(title: title, message: message, preferredStyle: UIAlertControllerStyle.alert)
        
        alert.addAction(UIAlertAction(title: "OK", style: UIAlertActionStyle.default, handler: { (action) in
            alert.dismiss(animated: true, completion: nil)
        }))
        self.present(alert, animated: true, completion: nil)
        
    }
    
    @IBAction func longAzul(_ sender: UILongPressGestureRecognizer) {
        self.alerta(title: "Azul", message: "papel/papelao")
    }
    
    @IBAction func longVermelho(_ sender: UILongPressGestureRecognizer) {
        self.alerta(title: "Vermelho", message: "plástico/isopor")
    }
    
    @IBAction func longVerde(_ sender: UILongPressGestureRecognizer) {
        self.alerta(title: "Verde", message: "vidro")
    }
    
    @IBAction func longAmarelo(_ sender: UILongPressGestureRecognizer) {
        self.alerta(title: "Amarelo", message: "metal")
    }
    
    @IBAction func longPreto(_ sender: UILongPressGestureRecognizer) {
        self.alerta(title: "Preto", message: "madeira")
    }
    
    @IBAction func longLaranja(_ sender: UILongPressGestureRecognizer) {
        self.alerta(title: "Laranja", message: "Perigosos ou contaminosos")
    }
    
    @IBAction func longBranco(_ sender: UILongPressGestureRecognizer) {
        self.alerta(title: "Branco", message: "Ambulatórios e servico de saúde")
    }
    
    @IBAction func longRoxo(_ sender: UILongPressGestureRecognizer) {
        self.alerta(title: "Roxo", message: "Radioativos")
    }
    
    @IBAction func longMarrom(_ sender: UILongPressGestureRecognizer) {
        self.alerta(title: "Marrom", message: "Organicos, como restos de alimento")
    }
    
    @IBAction func longCinza(_ sender: UILongPressGestureRecognizer) {
        self.alerta(title: "Cinza", message: "Resíduo geral não reciclável ou misturado")
    }
    
    
    
    @IBAction func azul(_ sender: Any) {
        self.cadastro.listaLocaisEspecificos.removeAll()
        self.carregarLocaisEspecificos(tipo: "azul")
        //print("Entrou em azul")
    }
    
    
    @IBAction func vermelho(_ sender: Any) {
        self.cadastro.listaLocaisEspecificos.removeAll()
        self.carregarLocaisEspecificos(tipo: "vermelho")
    }
    
    @IBAction func verde(_ sender: Any) {
        self.cadastro.listaLocaisEspecificos.removeAll()
        self.carregarLocaisEspecificos(tipo: "verde")
    }
    
    @IBAction func amarelo(_ sender: Any) {
        self.cadastro.listaLocaisEspecificos.removeAll()
        self.carregarLocaisEspecificos(tipo: "amarelo")
    }
    
    
    @IBAction func preto(_ sender: Any) {
        self.cadastro.listaLocaisEspecificos.removeAll()
        self.carregarLocaisEspecificos(tipo: "preto")
    }
    
    
    @IBAction func laranja(_ sender: Any) {
        self.cadastro.listaLocaisEspecificos.removeAll()
        self.carregarLocaisEspecificos(tipo: "laranja")
    }
    
    
    @IBAction func branco(_ sender: Any) {
        self.cadastro.listaLocaisEspecificos.removeAll()
        self.carregarLocaisEspecificos(tipo: "branco")
    }
    
    
    @IBAction func lilas(_ sender: Any) {
        self.cadastro.listaLocaisEspecificos.removeAll()
        self.carregarLocaisEspecificos(tipo: "lilas")
    }
    
    
    @IBAction func marrom(_ sender: Any) {
        self.cadastro.listaLocaisEspecificos.removeAll()
        self.carregarLocaisEspecificos(tipo: "marrom")
    }
    
    
    @IBAction func cinza(_ sender: Any) {
        self.cadastro.listaLocaisEspecificos.removeAll()
        self.carregarLocaisEspecificos(tipo: "cinza")
    }
    
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if (segue.identifier == "segue_azul"){
            let lvc = segue.destination as! ListaViewController
            lvc.cadastro = self.cadastro
            print("Finalizou prepare()")
        }else if (segue.identifier == "segue_vermelho"){
            let lvc = segue.destination as! ListaViewController
            lvc.cadastro = self.cadastro
            print("Finalizou prepare()")
        }else if (segue.identifier == "segue_verde"){
            let lvc = segue.destination as! ListaViewController
            lvc.cadastro = self.cadastro
            print("Finalizou prepare()")
        }else if (segue.identifier == "segue_amarelo"){
            let lvc = segue.destination as! ListaViewController
            lvc.cadastro = self.cadastro
            print("Finalizou prepare()")
        }else if (segue.identifier == "segue_preto"){
            let lvc = segue.destination as! ListaViewController
            lvc.cadastro = self.cadastro
            print("Finalizou prepare()")
        }else if (segue.identifier == "segue_laranja"){
            let lvc = segue.destination as! ListaViewController
            lvc.cadastro = self.cadastro
            print("Finalizou prepare()")
        }else if (segue.identifier == "segue_branco"){
            let lvc = segue.destination as! ListaViewController
            lvc.cadastro = self.cadastro
            print("Finalizou prepare()")
        }else if (segue.identifier == "segue_lilas"){
            let lvc = segue.destination as! ListaViewController
            lvc.cadastro = self.cadastro
        }else if (segue.identifier == "segue_marrom"){
            let lvc = segue.destination as! ListaViewController
            lvc.cadastro = self.cadastro
        }else if (segue.identifier == "segue_cinza"){
            let lvc = segue.destination as! ListaViewController
            lvc.cadastro = self.cadastro
        }
    }
     
    func carregarLocaisEspecificos(tipo: String) {
        for var local in self.cadastro.getLista(){
            if (local.getTipo() == tipo){
                self.cadastro.addLocaisEspecificos(local: local)
                print(local.tipo)
            }
        }
        
    }
    
    

    
}

