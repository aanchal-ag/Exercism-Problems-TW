class RnaTranscription {

    String transcribe(String dnaStrand) {
        int i;
        String rna="";
        for(i=0;i<dnaStrand.length();i++)
            {
                char ch =dnaStrand.charAt(i);
                if (ch=='G')
                    rna=rna.concat("C");
                else if (ch =='C')
                    rna=rna.concat("G");
                else if (ch=='T')
                    rna=rna.concat("A");
                else if (ch=='A')
                    rna=rna.concat("U");
                
            }
        return rna;
        
    }

}
