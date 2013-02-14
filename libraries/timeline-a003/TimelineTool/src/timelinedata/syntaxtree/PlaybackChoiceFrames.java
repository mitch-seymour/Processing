//
// Generated by JTB 1.3.2
//

package timelinedata.syntaxtree;

/**
 * Grammar production:
 * integerLiteral -> IntegerLiteral()
 * nodeToken -> "FPS"
 */
public class PlaybackChoiceFrames implements Node {
   public IntegerLiteral integerLiteral;
   public NodeToken nodeToken;

   public PlaybackChoiceFrames(IntegerLiteral n0, NodeToken n1) {
      integerLiteral = n0;
      nodeToken = n1;
   }

   public PlaybackChoiceFrames(IntegerLiteral n0) {
      integerLiteral = n0;
      nodeToken = new NodeToken("FPS");
   }

   public void accept(timelinedata.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(timelinedata.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(timelinedata.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(timelinedata.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

