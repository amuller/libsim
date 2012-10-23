package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.common.Transformations;
import com.simmachines.libsim.enc.vector.Cosine;

/**
 * [TechnologicalCosine distance]
 * <p>
 * :: The technological distance between two firms is a distance between their patent portfolios.
 * <p>
 * [Brief Description]
 * <p>
 * The patent portfolios, are vectors of the number of patents granted in (usually 36, in this case 29) technological sub-categories.
 * <p>
 * [Definition]
 * <p>
 
 
 The TechnologicalCosine distance is given by the Cosine distance between two vectors \(a,b\) representing the patent portfolios of two firms:
 <p>
 \( d=1-\frac{\langle a,b \rangle}{\| a \|_2 \cdot \| b \|_2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 28.2 :: Distances in Economics and Human Geography :: P.515 |
 * <p>
 * 
 * @author  Jose Daniel Salazar-Vargas
 * 
 */


public class TechnologicalCosine {
		
	/**
	 * Creates a vector using the received values representing number of patents in specific technological areas.
	 * @param p702 Data processing: measuring, calibrating, or testing
	 * @param p703 Data processing: structural design, modeling, simulation, and emulation
	 * @param p704 Data processing: speech signal processing, linguistics, language translation, and audio compression/decompression
	 * @param p705 Data processing: financial, business practice, management, or cost/price determination
	 * @param p706 Data processing: artificial intelligence
	 * @param p707 Data processing: database and file management or data structures
	 * @param p708 Electrical computers: arithmetic processing and calculating
	 * @param p709 Electrical computers and digital processing systems: multicomputer data transferring
	 * @param p710 Electrical computers and digital data processing systems: input/output
	 * @param p711 Electrical computers and digital processing systems: memory
	 * @param p712 Electrical computers and digital processing systems: processing architectures and instruction processing (e.g., processors)
	 * @param p713 Electrical computers and digital processing systems: support
	 * @param p714 Error detection/correction and fault detection/recovery
	 * @param p715 Data processing: presentation processing of document, operator interface processing, and screen saver display processing
	 * @param p716 Computer-aided design and analysis of circuits and semiconductor masks
	 * @param p717 Data processing: software development, installation, and management
	 * @param p718 Electrical computers and digital processing systems: virtual machine task or process management or task management/control
	 * @param p719 Electrical computers and digital processing systems: interprogram communication or interprocess communication (ipc)
	 * @param p720 Dynamic optical information storage or retrieval
	 * @param p725 Interactive video distribution systems
	 * @param p726 Information security
	 * @param p800 Multicellular living organisms and unmodified parts thereof and related processes
	 * @param p850 Scanning-probe techniques or apparatus; applications of scanning-probe techniques, e.g., scanning probe microscopy [spm]
	 * @param p901 Robots
	 * @param p902 Electronic funds transfer
	 * @param p903 Hybrid electric vehicles (hevs)
	 * @param p930 Peptide or protein sequence
	 * @param p968 Horology
	 * @param p976 Nuclear technology
	 * @return Int vector of the received values.
	 */
	public static int[] createTechnologyVector(int p702, int p703, int p704, int p705, int p706, int p707, int p708, int p709,int p710, int p711, int p712,int p713, int p714, int p715, int p716,int p717, int p718, int p719, int p720, int p725, int p726, int p800, int p850, int p901, int p902, int p903, int p930, int p968, int p976){
		return new int[]{p702, p703, p704, p705, p706, p707, p708, p709, p710, p711, p712, p713, p714, p715, p716, p717, p718, p719, p720, p725, p726, p800, p850, p901, p902, p903, p930, p968, p976};
	}
	
	
	/**
	 * Calculates the Technological distance (using the cosine distance) between two technology patent vectors.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Technological distance.
	 * @see com.simmachines.libsim.enc.vector.Cosine;
	 */
	public static double distance(int v1[], int v2[]){
		return Cosine.distance(Transformations.convertIntArrayToDoubleArray(v1), Transformations.convertIntArrayToDoubleArray(v2));
	}
	
}
