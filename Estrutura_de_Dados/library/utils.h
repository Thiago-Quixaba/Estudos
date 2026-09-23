#ifndef utils_h
#define utils_h

#define for_each(vetor) for (__typeof__((vetor)[0]) *index = (vetor); index != (vetor) + (sizeof((vetor)) / sizeof((vetor)[0])); index++)
#define for_in_range(inicio, fim) for (int index = (inicio); (fim) >= (inicio) ? index <= (fim) : index >= (fim); (fim) >= (inicio) ? index++ : index--)

#endif