//
//  ListaViewController.swift
//  ColetaSeletiva
//
//  Created by admin on 31/08/17.
//  Copyright © 2017 ColetaSeletiva. All rights reserved.
//

import UIKit

class ListaViewController: UITableViewController {
    var cadastro: Cadastro!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        print("Chegou no didiLoad de ListaViewController")

        // Uncomment the following line to preserve selection between presentations
        // self.clearsSelectionOnViewWillAppear = false

        // Uncomment the following line to display an Edit button in the navigation bar for this view controller.
        // self.navigationItem.rightBarButtonItem = self.editButtonItem()
    }
 
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        print("Entrou em viewWillAppear")

        
        self.tableView.reloadData()
    }
    


    // MARK: - Table view data source

    override func numberOfSections(in tableView: UITableView) -> Int {
        return 1
    }
    
    

    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "celula", for: indexPath)
        
        let local = self.cadastro.getLocalEspecifico(index: indexPath.row)
        
        print(local.description)
        cell.textLabel?.text = local.description
        
        return cell
    }

   
    // Override to support conditional editing of the table view.
    override func tableView(_ tableView: UITableView, canEditRowAt indexPath: IndexPath) -> Bool {
        return true
    }
 
    // Override to support conditional rearranging of the table view.
    override func tableView(_ tableView: UITableView, canMoveRowAt indexPath: IndexPath) -> Bool {
        return true
    }



   
     override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        print("Chegou no tableView.size() de ListaViewController")
        return self.cadastro.size()
     }
     
    // Override to support editing the table view.
    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCellEditingStyle, forRowAt indexPath: IndexPath) {
        if editingStyle == .delete {
            // Delete the row from the data source
            tableView.deleteRows(at: [indexPath], with: .fade)
        } else if editingStyle == .insert {
            // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view
        }    
    }
 

 
    // Override to support rearranging the table view.
    override func tableView(_ tableView: UITableView, moveRowAt fromIndexPath: IndexPath, to: IndexPath){

    }
    
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }

}
