/*
 * 		Source: RegKmeans
 *
 *      Author: Leandro Miranda
 *      email:leandromiranda@id.uff.br
 */

package example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import regClusterers.RegKMeans;
import weka.core.Instances;

public class MainRegKmeans {


	public static BufferedReader readDataFile(String filename) {
		BufferedReader inputReader = null;

		try {
			inputReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException ex) {
			System.err.println("File not found: " + filename);
		}

		return inputReader;
	}

	public static void main(String[] args) throws Exception {
		
		int[] assignments;
		RegKMeans kmeans;
		final int CLUSTER = 5;
		final String nameDataset = "datasets/Chicago.arff";

		kmeans = new RegKMeans();

		/* Important function. There are cases which 
		 * the number of seeds induces different types of clusters, eg. clusters contain one object*/
		kmeans.setSeed(1);
		
		kmeans.setDisplayStdDevs(false);

		kmeans.setPreserveInstancesOrder(false);
		kmeans.setNumClusters(CLUSTER);

		BufferedReader datafile = readDataFile(nameDataset);
		Instances data = new Instances(datafile);
		datafile.close();

		kmeans.setVisibleCentroids(false);
		kmeans.buildClusterer(data);

		// Print the result ?? la Weka explorer:
		String strSummary = kmeans.toString();

		System.out.println(strSummary);

		assignments = kmeans.getAssignmentsOficial();

		int t = 0;
		for (int clusterNum : assignments) {
			System.out.printf("Instance %d -> Cluster %d \n", t + 1, (clusterNum));
			t++;
		}

	}

}
