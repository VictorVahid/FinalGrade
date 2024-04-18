public class process {
	public String nomeAluno;
	public double NotaUm;
	public double NotaDois;
	public double NotaTres;


	public Double mediaALuno() {
		return NotaUm + NotaDois + NotaTres;
	}

	public double missingPoints() {
		if (mediaALuno() < 60.0) {
			return mediaALuno() - 60.0;
		} else
			return 0.0;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}
}
