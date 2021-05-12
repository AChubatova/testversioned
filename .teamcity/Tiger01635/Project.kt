package Tiger01635

import Tiger01635.buildTypes.*
import Tiger01635.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01635")
    name = "Tiger01635"

    vcsRoot(Tiger01635_cVCSroot)

    buildType(Tiger01635_Hi1)
    buildType(Tiger01635_Hi0)
    buildType(Tiger01635_Hi3)
    buildType(Tiger01635_Hi2)
})
