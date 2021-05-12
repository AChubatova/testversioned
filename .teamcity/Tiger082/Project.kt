package Tiger082

import Tiger082.buildTypes.*
import Tiger082.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger082")
    name = "Tiger082"

    vcsRoot(Tiger082_cVCSroot)

    buildType(Tiger082_Hi0)
    buildType(Tiger082_Hi2)
    buildType(Tiger082_Hi1)
    buildType(Tiger082_Hi3)
})
