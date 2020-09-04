package network.platon.contracts.wasm;

import com.platon.rlp.datatypes.Uint64;
import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.WasmFunctionEncoder;
import org.web3j.abi.datatypes.WasmFunction;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.WasmContract;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the org.web3j.codegen.WasmFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with platon-web3j version 0.13.0.6.
 */
public class ContractDelegateCallStorageVector extends WasmContract {
    private static String BINARY_0 = "0x0061736d01000000015a1060027f7f0060017f0060017f017f60027f7f017f60037f7f7f017f60000060037f7f7f0060047f7f7f7f017f60047f7f7f7f0060027f7e0060017f017e60037f7f7e006000017f60057f7f7f7f7f017f60017e017f6000017e02c4010803656e760c706c61746f6e5f70616e6963000503656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000c03656e7610706c61746f6e5f6765745f696e707574000103656e7617706c61746f6e5f6765745f73746174655f6c656e677468000303656e7610706c61746f6e5f6765745f7374617465000703656e7610706c61746f6e5f7365745f7374617465000803656e7614706c61746f6e5f64656c65676174655f63616c6c000d03656e760d706c61746f6e5f72657475726e0000035a5905020101010b03000206010604010000000203030900000900010f04000307000104070200000304060001020e03000100000003060000040200020004070104000003030203000806000206050a0a010501020505020208000405017001030305030100020608017f0141808c040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300080f5f5f66756e63735f6f6e5f65786974005806696e766f6b6500540908010041010b020a0a0ad67f59100041cc0910091a4101100b105b105c0b190020004200370200200041086a41003602002000100c20000b0300010b940101027f41d809410136020041dc09280200220145044041dc0941e40936020041e40921010b024041e00928020022024120460440418402104c2201450d012001105a220141dc0928020036020041dc09200136020041e0094100360200410021020b41e009200241016a360200200120024102746a22014184016a4100360200200141046a20003602000b41d80941003602000b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0b9118020d7f017e230041a0016b22032400200341206a418008100e210b2000280208200041016a220d20002d0000220541017122071b210a2000280204200541017620071b21084101210741002105024003402007410171410020042008491b04402004200a6a2d00002206415f6a41ff017141de004921072005200641bf7f6a41ff0171411a4972210520092006419f7f6a41ff0171411a49722109200441016a21040c01050240200720052009714101737121052008450d002008210403402004450d012004200a6a2004417f6a22062104417f6a2d00004131470d000b0c030b0b0b417f21060b02400240200541017145200641076a20084b72200641016a410249200841da004b72720d00410021042003410036029001200342003703880120034188016a20082006417f7322056a100f4101210702400240024003402004200028020420002d00002209410176200941017122091b20056a4f044002402007410171450d05200341306a1009220841016a2104410021070340200620074604402008280204220920032d003022054101762200200541017122051b2207200b28020420032d00202206410176200641017122061b470d05200b280208200b41016a20061b210620050d02200021072004210503402007450440200021090c080b20052d000020062d0000470d06200641016a2106200541016a21052007417f6a21070c000b00052000280208200d20002d00004101711b20076a2c000022054120722005200541bf7f6a411a491b210e024002400240027f20032d0030220a4101712205450440410a2109200a4101760c010b2008280200220a417e71417f6a210920082802040b220c200946044020082802082004200a4101711b210f416f210a200941e6ffffff074d0440410b20094101742205200941016a220a200a2005491b220541106a4170712005410b491b210a0b200a10102205200f200910112008200a410172360200200820053602080c010b2005450d01200828020821050b2008200c41016a3602040c010b2003200c41017441026a3a0030200421050b2005200c6a220541003a00012005200e3a0000200741016a21070c010b000b000b0520032802880120046a2000280208200d20091b20066a20046a41016a2d00004190086a2d000022093a00002007200941ff0147712107200441016a21040c010b0b2007450d012008280208210503402007450d0220052d000020062d0000470d01200641016a2106200541016a21052007417f6a21070c000b000b200341e0006a1012200341186a200341f0006a280200360200200341106a200341e8006a290300370300200341003a001c200320032903603703082003280288012200450d032003200036028c010c030b410021062003410036024820034200370340200341406b2009410174410172100f03402006200828020420032d00302200410176200041017122001b2205490440200328024020066a2008280208200420001b20066a2d000022004105763a00002003280240200828020420032d0030220541017620054101711b6a20066a41016a2000411f713a0000200641016a21060c010b0b200328024020056a41003a0000200328024421060240200328028c01220020032802880122046b22054101480d0020052003280248220820066b4c0440034020002004460d02200620042d00003a00002003200328024441016a2206360244200441016a21040c000b000b200341f0006a200341c8006a360200410021092003410036026c2006200328024022076b210a200520066a20076b2205200820076b2207410174220820082005491b41ffffffff07200741ffffffff03491b220704402007101021090b2003200936026020032009200a6a22053602682003200720096a36026c20032005360264200341e0006a4104722107034020002004470440200520042d00003a00002003200328026841016a2205360268200441016a21040c010b0b200328024020062007101302402003280244220720066b220041004c0440200328026821060c010b2003200328026820062000101420006a2206360268200328024421070b2003280240210020032003280264360240200320003602642003200636024420032007360268200328024821052003200328026c3602482003200536026c20032000360260200341e0006a1015200328024421060b200342003702442003280240210720034100360240200620076b21064101210403402006044020072d000041002004411d764101716b41b3c5d1d0027141002004411c764101716b41dde788ea037141002004411b764101716b41fab384f5017141002004411a764101716b41ed9cc2b20271410020044119764101716b41b2afa9db0371200441057441e0ffffff037173737373737321042006417f6a2106200741016a21070c010b0b20044101470d004100210720034100360248200342003703402003410036021020034200370308027f4100200328028c01417a6a220020032802880122046b2205450d001a200341086a20051016034020002004470440200328020c220520042d00003a00002003200541016a36020c200441016a21040c010b0b20032802082107200328020c0b20076b210b200341c8006a210c410021044100210541002100024003402000200b4604400240200704402003200736020c0b2005410820046b7441ff0171452004410548710d00200328024021040c030b05200020076a2d0000200541057441e01f71722105200441056a21040340200441084e04402005200441786a2204762109200328024422082003280248220a490440200820093a00002003200328024441016a360244052003200c360270410021062003410036026c2008200328024022086b220d41016a220e200a20086b2208410174220a200a200e491b41ffffffff07200841ffffffff03491b220804402008101021060b200320063602602006200d6a220a20093a00002003200620086a36026c2003200a3602642003200a41016a360268200341406b200341e0006a1017200341e0006a10150b0c010b0b200041016a21000c010b0b2003280244200328024022046b4114470d0041002104200341003a0008200341e0006a200341086a10182003280244200328024022006b210503402004200546200441134b72450440200341e0006a20046a200020046a2d00003a0000200441016a21040c010b0b200341186a200341f0006a280200360200200341106a200341e8006a29030037030020032003290360370308200341013a001c20000440200320003602440b200328028801220004402003200036028c010b200341206a419009100e220028020420032d00202205410176200541017122051b21042000280208200041016a20051b210642a5c688a1c89ca7f94b21100340200404402004417f6a21042006300000201042b383808080207e852110200641016a21060c010b0b20034188016a1019200341e0006a2001101a21014102101b2100200341d8006a4100360200200341d0006a4200370300200341c8006a420037030020034200370340200341406b2010101c200341406b2001101d20002003280240101e20002010101f200020011020027f02400240200028020c200041106a280200460440200041046a2106200028020021070c010b200041046a2106100020002802002107200028020c2000280210470d010b20070c010b100020002802000b210120034100360238200342003703300240200120062802006a20076b2201450d00200341306a2001101620014101480d002003200328023420072001101420016a3602340b200341406b4104721021200028020c22010440200020013602100b4100210420022110034020105045044020104208882110200441016a21040c010b0b2003410036026820034200370360200341e0006a2004100f2003280264417f6a21040340200250450440200420023c00002004417f6a2104200242088821020c010b0b200341086a20032802302200200328023420006b20032802602201200328026420016b10061a200328026022010440200320013602640b2000450d03200320003602340c030b2004450d00200320043602440b2003280288012200450d002003200036028c010b200341e0006a1012200341186a200341f0006a280200360200200341106a200341e8006a290300370300200341003a001c200320032903603703080b200341a0016a24000b910101027f20004200370200200041086a410036020020012102024003402002410371044020022d0000450d02200241016a21020c010b0b2002417c6a21020340200241046a22022802002203417f73200341fffdfb776a7141808182847871450d000b0340200341ff0171450d01200241016a2d00002103200241016a21020c000b000b20002001200220016b105320000bfa0101057f230041206b22022400024020002802042203200028020022046b22052001490440200028020820036b200120056b22044f04400340200341003a00002000200028020441016a22033602042004417f6a22040d000c030b000b20002001103b2106200241186a200041086a3602002002410036021441002101200604402006101021010b200220013602082002200120056a22033602102002200120066a3602142002200336020c0340200341003a00002002200228021041016a22033602102004417f6a22040d000b2000200241086a1017200241086a10150c010b200520014d0d002000200120046a3602040b200241206a24000b0b002000410120001b104c0b10002002044020002001200210141a0b0b2401017f230041106b22012400200141003a000f20002001410f6a1018200141106a24000b270020022002280200200120006b22016b2202360200200141014e044020022000200110141a0b0bf80801067f0340200020046a2105200120046a220341037145200220044672450440200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220845044003402006411049450440200020046a2202200120046a2203290200370200200241086a200341086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2202200120046a2201290200370200200141086a2103200241086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002008417f6a220841024b0d00024002400240024002400240200841016b0e020102000b2005200120046a220628020022033a0000200541016a200641016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2202200120046a220541046a2802002207410874200341187672360200200241046a200541086a2802002203410874200741187672360200200241086a2005410c6a28020022074108742003411876723602002002410c6a200541106a2802002203410874200741187672360200200441106a2104200641706a21060c000b000b2005200120046a220628020022033a0000200541016a200641016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2202200120046a220541046a2802002207411074200341107672360200200241046a200541086a2802002203411074200741107672360200200241086a2005410c6a28020022074110742003411076723602002002410c6a200541106a2802002203411074200741107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022033a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2202200120046a220541046a2802002207411874200341087672360200200241046a200541086a2802002203411874200741087672360200200241086a2005410c6a28020022074118742003410876723602002002410c6a200541106a2802002203411874200741087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b2b01027f200028020821012000280204210203402001200247044020002001417f6a22013602080c010b0b0b2001017f2000200110102202360200200020023602042000200120026a3602080b6701017f20002802002000280204200141046a1013200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2601017f03402002411446450440200020026a20012d00003a0000200241016a21020c010b0b0b29002000410036020820004200370200200041001036200041146a41003602002000420037020c20000b250020002001104a1a2000410c6a2001410c6a104a1a200041186a200141186a104a1a20000b840201057f2001044020002802042104200041106a2802002202200041146a280200220349044020022001ad2004ad422086843702002000200028021041086a36021020000f0b027f41002002200028020c22026b410375220541016a2206200320026b2202410275220320032006491b41ffffffff01200241037541ffffffff00491b2203450d001a200341037410100b2102200220054103746a22052001ad2004ad4220868437020020052000280210200028020c22066b22016b2104200141014e044020042006200110141a0b2000200220034103746a3602142000200541086a3602102000200436020c20000f0b200041c00110382000410041004101104f20000b880102027f017e4101210220014280015a044041002102034020012004845045044020044238862001420888842101200241016a2102200442088821040c010b0b200241384f047f2002104220026a0520020b41016a21020b200041186a28020022030440200041086a280200200041146a2802002003103f21000b2000200028020020026a3602000b4001017f230041206b220224002000410010352200200110492000200241106a2001410c6a104a104b2002200141186a104a104b410110351a200241206a24000b1300200028020820014904402000200110360b0bbe0202037f027e02402001500440200041800110380c010b20014280015a044020012106034020052006845045044020054238862006420888842106200241016a2102200542088821050c010b0b0240200241384f04402002210403402004044020044108762104200341016a21030c010b0b200341c9004f044010000b2000200341b77f6a41ff017110382000200028020420036a1039200028020420002802006a417f6a21032002210403402004450d02200320043a0000200441087621042003417f6a21030c000b000b200020024180017341ff017110380b2000200028020420026a1039200028020420002802006a417f6a21024200210503402001200584500d02200220013c0000200542388620014208888421012002417f6a2102200542088821050c000b000b20002001a741ff017110380b20004101103a0bfa0101057f230041a0016b2202240020004103101b2100200241d8006a4100360200200241d0006a4200370300200241c8006a420037030020024200370340200241406b20011049200241406b200241306a2001410c6a2203104a104b200241206a200141186a2204104a104b20002002280240101e20004101101b210020024198016a410036020020024190016a420037030020024188016a4200370300200242003703800120024180016a200241f0006a2001104a104b2000200228028001101e2000200241e0006a2001104a104d210041046a10212000200241106a2003104a104d20022004104a104d1a41046a1021200241a0016a24000bea0101047f230041106b22042400200028020422012000280210220341087641fcffff07716a2102027f410020012000280208460d001a2002280200200341ff07714102746a0b2101200441086a20001048200428020c210303400240200120034604402000410036021420002802082102200028020421010340200220016b41027522034103490d022000200141046a22013602040c000b000b200141046a220120022802006b418020470d0120022802042101200241046a21020c010b0b2003417f6a220241014d04402000418004418008200241016b1b3602100b200020011041200441106a24000bc80b010b7f230041e0016b22002400200041206a4100360200200042003703182000428aa4bedd86c3aeee583703102000410036020820004200370300200041b0016a10192205428aa4bedd86c3aeee58101f200528020c200541106a28020047044010000b200041186a21060240200528020022032005280204220410032202450d002000410036024820004200370340200041406b2002100f2003200420002802402203200028024420036b1004417f47044002400240200041286a2000280240220141016a20002802442001417f736a10232204280204450d0020042802002d000041c001490d00200041d0006a200410242000280254210141002103034020010440200041002000280250220820082001102522076a20084520012007497222081b3602504100200120076b20081b2101200341016a21030c010b0b2000280220200028021822016b41246d20034904402006200041d0006a2003200028021c20016b41246d200041206a102622011027200110280b20004188016a2004410110292103200041f8006a200441001029210820032802042101200041206a2107034020082802042001464100200328020822042008280208461b0d02200041c8016a20012004411c102a200041d0006a102b2201102c0240200028021c2204200028022049044020042001102d2000200028021c41246a36021c0c010b20004198016a2006200420002802186b41246d220441016a102e200420071026210420002802a0012001102d200020002802a00141246a3602a001200620041027200410280b20032003280204220120032802086a410020011b22013602042003280200220404402003200436020820012004102521012003027f200328020422094504404100210441000c010b4100210441002003280208220a2001490d001a200a20012001417f461b210420090b2201ad2004ad42208684370204200341002003280200220920046b2204200420094b1b36020005200341003602080b0c000b000b10000b200221010b20002802402202450d00200020023602440b200528020c22020440200520023602100b024020010d002000411c6a210520002802042203200028020022016b41246d22042000280220200028021822026b41246d4d04402004200028021c20026b41246d22044b044020012001200441246c6a22012002102f1a20012003200510300c020b2006200120032002102f10310c010b200204402006103220004100360220200042003703180b200020062004102e2206103322023602182000200236021c20002002200641246c6a36022020012003200510300b20002802182101200028021c200041c8016a1019220320002903101034101e20032000290310101f20016b41246d200328020c200341106a28020047044010000b200328020421042003280200200041b0016a10192102200041e8006a4100360200200041e0006a4200370300200041d8006a420037030020004200370350027f2000280218200028021c4604402000410136025041010c010b200041d0006a410010352105200028021c210720002802182101037f2001200746047f2005410110351a20002802500520052001101d200141246a21010c010b0b0b2105200041d0006a410472102141011010220141fe013a0000200228020c200241106a28020047044010000b2002280204220741016a220920022802084b047f20022009103620022802040520070b20022802006a2001410110141a2002200228020441016a3602042002200141016a200520016b6a101e2002200028021c20002802186b41246d101b2105200028021c210720002802182101034020012007470440200520011020200141246a21010c010b0b0240200228020c2002280210460440200228020021010c010b100020022802002101200228020c2002280210460d0010000b2004200120022802041005200228020c22010440200220013602100b200328020c22010440200320013602100b200041186a103720001037200041e0016a2400ad0b0c00200020012002411c102a0b2101017f20011052220220012802044b044010000b200020012001105e2002105f0b2301017f230041206b22022400200241086a200020014114102a105d200241206a24000b4c01017f2000410036020c200041106a2003360200200104402001103321040b2000200436020020002004200241246c6a220236020820002004200141246c6a36020c2000200236020420000b900101027f2000280204210220002802002103034020022003464504402001280204415c6a2002415c6a2202102d20012001280204415c6a3602040c010b0b200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2b01027f200028020821012000280204210203402001200247044020002001415c6a22013602080c010b0b0be70101037f230041106b2204240020004200370200200041086a410036020020012802042103024002402002450440200321020c010b410021022003450d002003210220012802002d000041c001490d00200441086a2001102420004100200428020c2201200428020822022001102522032003417f461b20024520012003497222031b220536020820004100200220031b3602042000200120056b3602000c010b20012802002103200128020421012000410036020020004100200220016b20034520022001497222021b36020820004100200120036a20021b3602040b200441106a240020000b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000105d20024f0d002003410471044010000c010b200042003702000b02402003411071450d002000105d20024d0d0020034104710440100020000f0b200042003702000b20000b1900200010091a2000410c6a10091a200041186a10091a20000b5e01017f230041306b22022400200220004100103c200241186a20024100103c200241186a2001103d200241186a20004101103c200241186a2001410c6a103d200241186a20004102103c200241186a200141186a103d200241306a24000b620020002001290200370200200041086a200141086a2802003602002001100c200041146a200141146a2802003602002000200129020c37020c2001410c6a100c200041206a200141206a28020036020020002001290218370218200141186a100c0b2f01017f2001200028020820002802006b41246d2200410174220220022001491b41c7e3f138200041e3f1b81c491b0b3e000340200020014645044020022000103e2002410c6a2000410c6a103e200241186a200041186a103e200241246a2102200041246a21000c010b0b20020b2e000340200020014645044020022802002000101a1a2002200228020041246a360200200041246a21000c010b0b0b0900200020013602040b0b002000200028020010310b0900200041246c10100b4b01027f230041206b22012400200141186a4100360200200141106a4200370300200141086a42003703002001420037030020012000101c200128020020014104721021200141206a24000bbf0c02077f027e230041306b22052400200041046a2107027f20014101460440200041086a280200200041146a280200200041186a22022802002204103f280200210120022004417f6a360200200710404180104f044020072000410c6a280200417c6a10410b200141384f047f2001104220016a0520010b41016a2101200041186a28020022020440200041086a280200200041146a2802002002103f0c020b20000c010b0240200710400d00200041146a28020022014180084f0440200020014180786a360214200041086a2201280200220228020021042001200241046a360200200520043602182007200541186a10430c010b2000410c6a2802002202200041086a2802006b4102752204200041106a2203280200220620002802046b220141027549044041802010102104200220064704400240200028020c220120002802102206470d0020002802082202200028020422034b04402000200220012002200220036b41027541016a417e6d41027422036a1044220136020c2000200028020820036a3602080c010b200541186a200620036b2201410175410120011b22012001410276200041106a10452102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021046200028020c21010b200120043602002000200028020c41046a36020c0c020b02402000280208220120002802042206470d00200028020c2202200028021022034904402000200120022002200320026b41027541016a41026d41027422036a104722013602082000200028020c20036a36020c0c010b200541186a200320066b2201410175410120011b2201200141036a410276200041106a10452102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021046200028020821010b2001417c6a2004360200200020002802082201417c6a22023602082002280200210220002001360208200520023602182007200541186a10430c010b20052001410175410120011b200420031045210241802010102106024020022802082201200228020c2208470d0020022802042204200228020022034b04402002200420012004200420036b41027541016a417e6d41027422036a104422013602082002200228020420036a3602040c010b200541186a200820036b2201410175410120011b22012001410276200241106a280200104521042002280208210320022802042101034020012003470440200428020820012802003602002004200428020841046a360208200141046a21010c010b0b20022902002109200220042902003702002004200937020020022902082109200220042902083702082004200937020820041046200228020821010b200120063602002002200228020841046a360208200028020c2104034020002802082004460440200028020421012000200228020036020420022001360200200228020421012002200436020420002001360208200029020c21092000200229020837020c2002200937020820021046052004417c6a210402402002280204220120022802002208470d0020022802082203200228020c22064904402002200120032003200620036b41027541016a41026d41027422066a104722013602042002200228020820066a3602080c010b200541186a200620086b2201410175410120011b2201200141036a410276200228021010452002280208210620022802042101034020012006470440200528022020012802003602002005200528022041046a360220200141046a21010c010b0b20022902002109200220052903183702002002290208210a20022005290320370208200520093703182005200a3703201046200228020421010b2001417c6a200428020036020020022002280204417c6a3602040c010b0b0b200541186a20071048200528021c410036020041012101200041186a0b2202200228020020016a360200200541306a240020000b2f01017f200028020820014904402001104c200028020020002802041014210220002001360208200020023602000b0b0e0020002802000440200010320b0b2500200041011060200028020020002802046a20013a00002000200028020441016a3602040b0f00200020011036200020013602040b820201047f02402001450d00034020002802102202200028020c460d01200241786a28020020014904401000200028021021020b200241786a2203200328020020016b220136020020010d012000200336021020004101200028020422042002417c6a28020022016b22021042220341016a20024138491b220520046a1039200120002802006a220420056a2004200210500240200241374d0440200028020020016a200241406a3a00000c010b200341f7016a220441ff014d0440200028020020016a20043a00002000280200200120036a6a210103402002450d02200120023a0000200241087621022001417f6a21010c000b000b10000b410121010c000b000b0b2e01017f2001200028020820002802006b2200410174220220022001491b41ffffffff07200041ffffffff03491b0bc90202077f017e230041106b220324002001280208220520024b0440200341086a2001102420012003280208200328020c102536020c200320011024410021052001027f410020032802002206450d001a410020032802042208200128020c2207490d001a200820072007417f461b210420060b360210200141146a2004360200200141003602080b200141106a210903402001280214210402402005200249044020040d01410021040b2000200928020020044114102a1a200341106a24000f0b20032001102441002104027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820066b2104200620076a0b21052001200436021420012005360210200320094100200520041025105f20012003290300220a3702102001200128020c200a422088a76a36020c2001200128020841016a22053602080c000b000bf40201057f230041206b22022400024002402000280204044020002802002d000041c001490d010b200241086a10091a0c010b200241186a200010512000105221030240024002400240200228021822000440200228021c220420034f0d010b41002100200241106a410036020020024200370308410021040c010b200241106a4100360200200242003703082000200420032003417f461b22046a21052004410a4b0d010b200220044101743a0008200241086a41017221030c010b200441106a4170712206101021032002200436020c20022006410172360208200220033602100b03402000200546450440200320002d00003a0000200341016a2103200041016a21000c010b0b200341003a00000b024020012d0000410171450440200141003b01000c010b200128020841003a00002001410036020420012d0000410171450d00200141003602000b20012002290308370200200141086a200241106a280200360200200241086a100c200241206a24000b880201047f20002001470440200128020420012d00002202410176200241017122031b2102200141016a21042001280208410a2101200420031b210420002d0000410171220304402000280200417e71417f6a21010b200220014d0440027f2003044020002802080c010b200041016a0b21012002044020012004200210500b200120026a41003a000020002d00004101710440200020023602040f0b200020024101743a00000f0b416f2103200141e6ffffff074d0440410b20014101742201200220022001491b220141106a4170712001410b491b21030b200310102201200420021011200020023602042000200341017236020020002001360208200120026a41003a00000b0b25002000200120026a417f6a220141087641fcffff07716a280200200141ff07714102746a0b2801017f200028020820002802046b2201410874417f6a410020011b200028021420002802106a6b0b2501017f200028020821020340200120024645044020002002417c6a22023602080c010b0b0b1e01017f03402000044020004108762100200141016a21010c010b0b20010ba10202057f017e230041206b22052400024020002802082202200028020c2206470d0020002802042203200028020022044b04402000200320022003200320046b41027541016a417e6d41027422046a104422023602082000200028020420046a3602040c010b200541086a200620046b2202410175410120021b220220024102762000410c6a10452103200028020821042000280204210203402002200446450440200328020820022802003602002003200328020841046a360208200241046a21020c010b0b20002902002107200020032902003702002003200737020020002902082107200020032902083702082003200737020820031046200028020821020b200220012802003602002000200028020841046a360208200541206a24000b2501017f200120006b220141027521032001044020022000200110500b200220034102746a0b4f01017f2000410036020c200041106a2003360200200104402001410274101021040b200020043602002000200420024102746a22023602082000200420014102746a36020c2000200236020420000b2b01027f200028020821012000280204210203402001200247044020002001417c6a22013602080c010b0b0b1b00200120006b22010440200220016b22022000200110500b20020b4f01037f20012802042203200128021020012802146a220441087641fcffff07716a21022000027f410020032001280208460d001a2002280200200441ff07714102746a0b360204200020023602000b2701017f230041106b2202240020004100103520022001104a104b410110351a200241106a24000b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204105320000ba10101037f41012103024002400240200128020420012d00002202410176200241017122041b220241014d0440200241016b0d032001280208200141016a20041b2c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002104220026a41016a21030b027f200041186a28020022010440200041086a280200200041146a2802002001103f0c010b20000b2201200128020020036a36020020000b970101047f230041106b220124002001200036020c2000047f41fc0b200041086a2202411076220041fc0b2802006a220336020041f80b200241f80b28020022026a41076a417871220436020002400240200341107420044d044041fc0b200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20022001410c6a4104101441086a0541000b200141106a24000b910101047f410121022001280208200141016a20012d0000220441017122051b210302400240024002402001280204200441017620051b2201410146044020032c000022014100480d012000200141ff017110380c040b200141374b0d01200121020b200020024180017341ff017110380c010b20002001104e200121020b2000200320024100104f0b20004101103a20000b5e01027f20011042220241b7016a22034180024e044010000b2000200341ff017110382000200028020420026a1039200028020420002802006a417f6a2100034020010440200020013a0000200141087621012000417f6a21000c010b0b0b2d00200020021060200028020020002802046a2001200210141a2000200028020420026a36020420002003103a0b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210141a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2104200020036a2205410371450440200220036b210241002103034020024104490d04200320056a200320046a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200520042d00003a0000200341016a21030c000b000b024020030d002001417f6a21030340200020026a22044103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042004417f6a200220036a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320046a2101200320056a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0bd40101047f200110522204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b410021032002200149200120046a20024b720d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000bff0201037f200028020445044041000f0b2000105941012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b5a01027f02402002410a4d0440200020024101743a0000200041016a21030c010b200241106a4170712204101021032000200236020420002004410172360200200020033602080b2003200120021011200220036a41003a00000b8a0202047f017e230041a0016b22002400100810012201104c22021002200041286a200041086a20022001102322014100103c02400240200041286a10552204500d00419c0910562004510d0141a10910562004510440200041286a10092102200041346a102b210320004200370358200041e0006a20014101103c200041e0006a2002103d200041e0006a20014102103c200041e0006a2003102c200041e0006a20014103103c2000200041e0006a105537035820004188016a2002104a200041e0006a2003101a2000290358100d200042003703980120004198016a10570c020b41bb0910562004520d0020001022370328200041286a10570c010b10000b1058200041a0016a24000b870202047f017e230041106b2203240020001059024002402000280204450d00200010590240200028020022012c0000220241004e044020020d010c020b200241807f460d00200241ff0171220441b7014d0440200028020441014d04401000200028020021010b20012d00010d010c020b200441bf014b0d012000280204200241ff017141ca7e6a22024d04401000200028020021010b200120026a2d0000450d010b2000280204450d0020012d000041c001490d010b10000b200341086a20001051200328020c220041094f044010000b200328020821010340200004402000417f6a210020013100002005420886842105200141016a21010c010b0b200341106a240020050b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b5f01027f230041206b22022400200241086a1019220120002903001034101e20012000290300101f200128020c200141106a28020047044010000b200128020020012802041007200128020c22000440200120003602100b200241206a24000b880101037f41d809410136020041dc092802002100034020000440034041e00941e0092802002201417f6a2202360200200141014845044041d8094100360200200020024102746a22004184016a280200200041046a28020011010041d809410136020041dc0928020021000c010b0b41e009412036020041dc09200028020022003602000c010b0b0b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0bc90201037f200041003a000020004184026a2201417f6a41003a0000200041003a0002200041003a00012001417d6a41003a00002001417e6a41003a0000200041003a00032001417c6a41003a00002000410020006b41037122026a22014100360200200141840220026b417c7122036a2202417c6a4100360200024020034109490d002001410036020820014100360204200241786a4100360200200241746a410036020020034119490d002001410036021820014100360214200141003602102001410036020c200241706a41003602002002416c6a4100360200200241686a4100360200200241646a41003602002003200141047141187222036b2102200120036a2101034020024120490d0120014200370300200141186a4200370300200141106a4200370300200141086a4200370300200141206a2101200241606a21020c000b000b20000b3501017f230041106b220041808c0436020c41f40b200028020c41076a417871220036020041f80b200036020041fc0b3f003602000b3801017f41e80b420037020041f00b410036020041742100034020000440200041f40b6a4100360200200041046a21000c010b0b4102100b0b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f2000105e200010526a0541010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5a01027f2000027f0240200128020022054504400c010b200220036a200128020422014b2001200249720d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b1b00200028020420016a220120002802084b04402000200110360b0b0bcb0102004180080b036c6178004190080bba01ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0fff0a1115141a1e0705ffffffffffffff1dff180d19090817ff12161f1b13ff010003100b1c0c0e060402ffffffffffff1dff180d19090817ff12161f1b13ff010003100b1c0c0e060402ffffffffff6164645f6d65737361676500696e69740064656c65676174655f63616c6c5f6164645f6d657373616765006765745f766563746f725f73697a65";

    public static String BINARY = BINARY_0;

    public static final String FUNC_DELEGATE_CALL_ADD_MESSAGE = "delegate_call_add_message";

    public static final String FUNC_GET_VECTOR_SIZE = "get_vector_size";

    protected ContractDelegateCallStorageVector(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected ContractDelegateCallStorageVector(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public static RemoteCall<ContractDelegateCallStorageVector> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallStorageVector.class, web3j, credentials, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<ContractDelegateCallStorageVector> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallStorageVector.class, web3j, transactionManager, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<ContractDelegateCallStorageVector> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallStorageVector.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public static RemoteCall<ContractDelegateCallStorageVector> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractDelegateCallStorageVector.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public RemoteCall<TransactionReceipt> delegate_call_add_message(String target_address, My_message one_message, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_DELEGATE_CALL_ADD_MESSAGE, Arrays.asList(target_address,one_message,gas), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> delegate_call_add_message(String target_address, My_message one_message, Uint64 gas, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_DELEGATE_CALL_ADD_MESSAGE, Arrays.asList(target_address,one_message,gas), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<Uint64> get_vector_size() {
        final WasmFunction function = new WasmFunction(FUNC_GET_VECTOR_SIZE, Arrays.asList(), Uint64.class);
        return executeRemoteCall(function, Uint64.class);
    }

    public static ContractDelegateCallStorageVector load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new ContractDelegateCallStorageVector(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static ContractDelegateCallStorageVector load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new ContractDelegateCallStorageVector(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public static class Message {
        public String head;
    }

    public static class My_message {
        public Message baseClass;

        public String body;

        public String end;
    }
}