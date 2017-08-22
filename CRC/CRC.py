"""
Dada a sequencia inicial, 10101101001, encontre a FCS da
sequencia, utilizando CRC, com polinomio gerador 1001.
M(x) = 10101101001
F(x) = 1001
R = 3.
"""

def CRC(seq_inicial, pol_gerador):

    R = len(pol_gerador) - 1
    Mx = seq_inicial + ("0" * R)
    seq_final = ""
    quebra = 0

    while quebra != 1:

        print ("Mx: " + Mx + "\nGx: " + pol_gerador)

        if(len(Mx) >= len(pol_gerador)):
            for i in range(len(pol_gerador)):
                if (Mx[i] == pol_gerador[i]):
                    seq_final += "0"
                else:
                    seq_final += "1"

            Mx = seq_final + Mx[R+1::]
            print ("    " + Mx)
            while Mx[0] == "0":
                Mx = Mx[1::]
                if len(Mx) == R:
                    quebra = 1
                    break

            print ("M(z): " + Mx  + "\n")
            seq_final = ""

    FCS = seq_inicial + Mx
    return FCS

def verificar_se_a_seq_chegou_corretamente(FCS, pol_gerador):

    R = len(pol_gerador) - 1
    seq_final = ""
    quebra = 0

    while quebra != 1:

        if(len(FCS) >= len(pol_gerador)):
            for i in range(len(pol_gerador)):
                if (FCS[i] == pol_gerador[i]):
                    seq_final += "0"
                else:
                    seq_final += "1"

            FCS = seq_final + FCS[R+1::]

            while FCS[0] == "0":
                FCS = FCS[1::]
                if len(FCS) == R:
                    quebra = 1
                    break

            seq_final = ""

    confirmacao = FCS

    if (not "1" in confirmacao):
        print ("Confirmação validada!")
    else:
        print ("Confirmação inválida!")


msg = "1010000001011110"
#fcs = CRC(msg, "1001")
#print ("FCS: " + fcs + "\n")
verificar_se_a_seq_chegou_corretamente(msg, "10101")

