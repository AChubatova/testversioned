package Tiger01032

import Tiger01032.buildTypes.*
import Tiger01032.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01032")
    name = "Tiger01032"

    vcsRoot(Tiger01032_cVCSroot)

    buildType(Tiger01032_Hi0)
    buildType(Tiger01032_Hi2)
    buildType(Tiger01032_Hi1)
    buildType(Tiger01032_Hi3)
})
